package project.controller;

import java.io.IOException;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import project.entity.RestaurantInfoEntity;
import project.entity.TableRestaurantImageEntity;
import project.repository.RestaurantInfoRepository;
import project.response.credential.Response;
import project.service.StorageService;

@RestController
@RequestMapping("/image")
public class TableRestaurantImageController 
{
		@Autowired
		private StorageService service;
		
		@Autowired
		RestaurantInfoRepository repo;

		@PostMapping("/postImage/{restInfoId}")
		public Response<?> uploadImage(@PathVariable int restInfoId,@RequestParam("image")MultipartFile file) throws IOException 
		{
			Optional<RestaurantInfoEntity> restInfo = repo.findById(restInfoId);
			
			if(restInfo.isPresent())
			{
				RestaurantInfoEntity restInfo1 = restInfo.get();
				TableRestaurantImageEntity savedImage = service.uploadImage(file,restInfo1);
				RestaurantInfoEntity restInfo2 = repo.save(restInfo1);
				return Response.getSuccessResponse(savedImage);
			}
			return Response.getErrorResponse("File Not Uploaded");
		}

		@GetMapping("/{fileName}")
		public ResponseEntity<?> downloadImage(@PathVariable String fileName)
		{
			byte[] imageData=service.downloadImage(fileName);
			return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.valueOf("image/png")).body(imageData);
		}
}
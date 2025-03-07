package project.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.entity.*;
import project.repository.CusinesRepository;
import project.repository.RestaurantInfoRepository;
import project.repository.TableFeatureRepository;

@Service
public class AddRestaurantService {
	
	@Autowired
	private TableFeatureRepository repo;
	
	@Autowired
	private CusinesRepository repo2;
	
	@Autowired
	private RestaurantInfoRepository repo3;

	public List<TableFeatureEntity> saveFeatures(List<TableFeatureEntity> list, RestaurantInfoEntity restInfo)
	{
		list.forEach((feature)->{
			feature.setRestInfo2(restInfo);
		});
		
		return repo.saveAll(list);
	}
	

	public List<CuisinesEntity> saveCusines(List<CuisinesEntity> list, RestaurantInfoEntity restInfo)
	{
		list.forEach((cusine)->{
			cusine.setRestInfo(restInfo);
		});
		
		return repo2.saveAll(list);
	}

}

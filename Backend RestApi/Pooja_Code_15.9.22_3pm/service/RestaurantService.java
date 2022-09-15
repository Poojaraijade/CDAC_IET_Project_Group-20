package project.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.entity.RestaurantEntity;
import project.repository.RestaurantRepository;
import project.response.credential.Credentials;

@Service
public class RestaurantService
{
	@Autowired
    RestaurantRepository repo;
	
    public Optional<RestaurantEntity> signIn(Credentials credentials) 
    {
		return repo.findByMobileNumberAndPassword(credentials.getMobileNo(), credentials.getPassword());
	}
}

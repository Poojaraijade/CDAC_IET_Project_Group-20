package project.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import project.entity.CustomerEntity;
import project.entity.RestaurantEntity;

public interface RestaurantRepository extends JpaRepository<RestaurantEntity, Integer>{

	public Optional<RestaurantEntity> findByMobileNumberAndPassword(long mob,String pwd);
	
	public Optional<RestaurantEntity> findByMobileNumber(long mob);
}

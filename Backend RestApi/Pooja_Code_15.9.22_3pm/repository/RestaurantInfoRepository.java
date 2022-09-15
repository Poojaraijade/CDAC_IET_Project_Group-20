package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.entity.RestaurantInfoEntity;

public interface RestaurantInfoRepository extends JpaRepository<RestaurantInfoEntity, Integer> 
{
	
}
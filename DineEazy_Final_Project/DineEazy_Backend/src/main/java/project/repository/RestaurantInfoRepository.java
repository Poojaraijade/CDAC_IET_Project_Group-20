package project.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import project.entity.RestaurantInfoEntity;

public interface RestaurantInfoRepository extends JpaRepository<RestaurantInfoEntity, Integer> {

	/*
	@Query(value="from project.entity.RestaurantInfoEntity ")
	public List<RestaurantInfoEntity> findAllByCity(String city); 
	*/
	
	@Query(value="from project.entity.RestaurantInfoEntity p order by p.minBookingAmountPerPerson desc")
	public List<RestaurantInfoEntity> findSortDesc();
	
	@Query(value="from project.entity.RestaurantInfoEntity  p order by p.minBookingAmountPerPerson")
	public List<RestaurantInfoEntity> findSortAsce();
	
	@Query(nativeQuery = true, value = "SELECT * FROM restaurant_info_entity s WHERE s.city = :city LIMIT 4")
	List<RestaurantInfoEntity> findRestaurantsByCity(@Param("city") String city);
}

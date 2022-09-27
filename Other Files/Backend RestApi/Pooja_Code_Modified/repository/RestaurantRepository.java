package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import project.entity.RestaurantEntity;

public interface RestaurantRepository extends JpaRepository<RestaurantEntity, Integer>{

}
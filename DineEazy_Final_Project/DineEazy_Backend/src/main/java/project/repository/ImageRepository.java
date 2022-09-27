package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import project.entity.TableRestaurantImageEntity;

public interface ImageRepository extends JpaRepository<TableRestaurantImageEntity, Integer>{

}

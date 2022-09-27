package project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import project.entity.RestaurantInfoEntity;
import project.entity.TableFeatureEntity;

public interface TableFeatureRepository extends JpaRepository<TableFeatureEntity, Integer>
{
	List<TableFeatureEntity> findAllByRestInfo2(RestaurantInfoEntity restInfo);
}

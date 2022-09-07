package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import project.entity.BestSellingItemEntity;

public interface BestSellingItemRepository extends JpaRepository<BestSellingItemEntity, Integer> {

}

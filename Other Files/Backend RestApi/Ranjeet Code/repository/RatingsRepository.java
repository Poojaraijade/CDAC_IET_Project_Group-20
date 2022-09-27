package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import project.entity.RatingsEntity;

public interface RatingsRepository extends JpaRepository<RatingsEntity, Integer> {

}

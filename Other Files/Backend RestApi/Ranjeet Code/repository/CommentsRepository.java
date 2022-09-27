package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import project.entity.CommentsEntity;


public interface CommentsRepository extends JpaRepository<CommentsEntity, Integer> {

}

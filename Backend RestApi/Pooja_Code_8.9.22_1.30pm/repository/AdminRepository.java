package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import project.entity.AdminEntity;

public interface AdminRepository extends JpaRepository<AdminEntity, Integer>{

}
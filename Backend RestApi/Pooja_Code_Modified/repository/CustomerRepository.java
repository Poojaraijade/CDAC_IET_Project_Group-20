package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import project.entity.CustomerEntity;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Integer>{


}
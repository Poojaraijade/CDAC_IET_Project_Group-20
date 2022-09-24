package project.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import project.entity.CustomerEntity;
import project.entity.TableBookingEntity;

public interface TableBookingRepository extends JpaRepository<TableBookingEntity, Integer>
{
	List<TableBookingEntity> findAllByCustomer(CustomerEntity customer);
	
	Optional<TableBookingEntity> findByBookingId(int id);
}

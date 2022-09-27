package project.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import project.entity.CustomerEntity;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Integer>
{
	public Optional<CustomerEntity> findByMobileNumberAndPassword(long mob,String pwd);
}
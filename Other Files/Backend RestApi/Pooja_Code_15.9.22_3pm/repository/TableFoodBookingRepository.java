package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.entity.TableFoodBookingEntity;

public interface TableFoodBookingRepository extends JpaRepository<TableFoodBookingEntity, Integer>
{
}

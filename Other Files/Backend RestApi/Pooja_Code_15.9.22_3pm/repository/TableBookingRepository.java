package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.entity.TableBookingEntity;

public interface TableBookingRepository extends JpaRepository<TableBookingEntity, Integer>
{
}

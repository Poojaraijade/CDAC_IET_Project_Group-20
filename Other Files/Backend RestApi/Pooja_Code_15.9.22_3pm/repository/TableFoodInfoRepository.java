package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.entity.TableFoodInfoEntity;

public interface TableFoodInfoRepository extends JpaRepository<TableFoodInfoEntity, Integer>
{
}

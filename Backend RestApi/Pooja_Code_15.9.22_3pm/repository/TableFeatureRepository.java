package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.entity.TableFeatureEntity;

public interface TableFeatureRepository extends JpaRepository<TableFeatureEntity, Integer>
{
}

package v8.com.timesheet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import v8.com.timesheet.models.PositionModel;

public interface PositionRepository extends JpaRepository<PositionModel, Integer> {
}

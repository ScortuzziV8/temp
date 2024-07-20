package v8.com.timesheet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import v8.com.timesheet.models.AcessProfileModel;

import java.util.Optional;

public interface AcessProfileRepository extends JpaRepository<AcessProfileModel, Integer> {
}

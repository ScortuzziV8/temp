package v8.com.timesheet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import v8.com.timesheet.models.UserModel;

public interface UserRepository extends JpaRepository<UserModel, Integer> {

//    boolean existsByEmail(String email);
}

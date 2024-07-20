package v8.com.timesheet.dtos;

import java.util.Date;

public record UserDTO(
        String name,
        String email,
        String password,
        String seniority,
        String phone,
        String creationDate,
        String updateDate,
        String comments,
        Integer positionId,
        Integer acessProfileId) {
}

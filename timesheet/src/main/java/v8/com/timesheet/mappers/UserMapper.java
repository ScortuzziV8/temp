package v8.com.timesheet.mappers;


import org.mapstruct.Mapper;
import v8.com.timesheet.dtos.UserDTO;
import v8.com.timesheet.models.UserModel;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDTO userModelToUserDTO(UserModel user);

    UserModel userDTOToUserModel(UserDTO userDTO);
}

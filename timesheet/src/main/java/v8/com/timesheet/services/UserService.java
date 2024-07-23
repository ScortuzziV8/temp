package v8.com.timesheet.services;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import v8.com.timesheet.dtos.UserDTO;
import v8.com.timesheet.expection.ValidationException;
import v8.com.timesheet.mappers.UserMapper;
import v8.com.timesheet.models.UserModel;
import v8.com.timesheet.repositories.AcessProfileRepository;
import v8.com.timesheet.repositories.PositionRepository;
import v8.com.timesheet.repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    private final UserRepository userRepository;
    private final AcessProfileRepository acessProfileRepository;
    private final PositionRepository positionRepository;
    public UserService(UserRepository userRepository, AcessProfileRepository acessProfileRepository, PositionRepository positionRepository) {
        this.userRepository = userRepository;
        this.acessProfileRepository = acessProfileRepository;
        this.positionRepository = positionRepository;
    }

    public void saveUser(UserDTO userDTO) {

        UserModel user = userMapper.userDTOToUserModel(userDTO);
        user.setAcessProfile(acessProfileRepository.findById(userDTO.acessProfileId()).get());
        user.setPosition(positionRepository.findById(userDTO.positionId()).get());
        user.setActive(true);

        userRepository.save(user);

    }
}

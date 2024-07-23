package v8.com.timesheet.controllers;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;
import v8.com.timesheet.dtos.UserDTO;
import v8.com.timesheet.expection.ValidationException;
import v8.com.timesheet.services.UserService;

@RestController
@RequestMapping("users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<String> saveUser(@RequestBody UserDTO userDTO, UriComponentsBuilder uriBuilder) {

            userService.saveUser(userDTO);
            return ResponseEntity.ok().build();

    }
}

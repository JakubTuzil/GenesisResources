package projekt3.GenesisResources.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import projekt3.GenesisResources.dto.UserDto;
import projekt3.GenesisResources.model.User;
import projekt3.GenesisResources.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping
    public User createUser(@RequestBody User userInput) {
        return userService.createUser(userInput);
    }

    @PutMapping
    public User updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }

    @GetMapping
    public List<UserDto> getAllUsers(
            @RequestParam(required = false, defaultValue = "false") boolean detail
    ) {
        return userService.getAllUsers(detail);
    }

    @GetMapping("/{id}")
    public UserDto getUserById(
            @PathVariable Integer id,
            @RequestParam(required = false, defaultValue = "false") boolean detail
    ) {
        return userService.getUserById(id, detail);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Integer id) {
        userService.deleteUserById(id);
    }
}


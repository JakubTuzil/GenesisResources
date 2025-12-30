package projekt3.GenesisResources.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import projekt3.GenesisResources.model.User;
import projekt3.GenesisResources.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public Object getAllUsers(boolean detail) {
        List<User> users = userRepository.findAll();

        if (users.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No users found");
        }

        if (detail) {
            return users;
        } else {
            List<Object> basicUsers = new ArrayList<>();
            for (User user : users) {
                basicUsers.add(new Object() {
                    public Integer id = user.getId();
                    public String name = user.getName();
                    public String surname = user.getSurname();
                });
            }
            return basicUsers;
        }
    }

    public Object getUserById(Integer id, boolean detail) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found"));

        if (detail) {
            return user;
        } else {
            return new Object() {
                public Integer id = user.getId();
                public String name = user.getName();
                public String surname = user.getSurname();
            };
        }
    }

    public void deleteUserById (Integer id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found"));
        userRepository.delete(user);
    }


//    public User createUser () {
//        return userRepository.save(user);
//    }
}

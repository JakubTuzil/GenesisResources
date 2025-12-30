package projekt3.GenesisResources.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projekt3.GenesisResources.model.User;
import projekt3.GenesisResources.repository.UserRepository;

import java.util.List;



@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}

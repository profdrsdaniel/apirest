package br.com.ulbra.apirest.services;

import br.com.ulbra.apirest.models.User;
import br.com.ulbra.apirest.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUser(Long id) {
        return this.userRepository.getUser(id);
    }

    public List<User> getUsers() {
        return this.userRepository.getUsers();
    }

    public User createUser(User user) {
        return this.userRepository.createUser(user);
    }

    public void deleteUser(Long id) {
        this.userRepository.deleteUser(id);
    }

}

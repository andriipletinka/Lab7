package com.example.lab7.user;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService() {
        this.userRepository = userRepository;
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public void addUser(User user) {
        if (userRepository.findUserByEmail(user.getEmail()).isEmpty()) {
            userRepository.save(user);
        }
    }
}

package com.example.lab7.user;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppUserService {

    private AppUserRepository appUserRepository;

    public AppUserService() {
        this.appUserRepository = appUserRepository;
    }

    public List<AppUser> getUsers() {
        return appUserRepository.findAll();
    }

    public void addUser(AppUser user) {
        if (appUserRepository.findUserByEmail(user.getEmail()).isEmpty()) {
            appUserRepository.save(user);
        }
    }
}

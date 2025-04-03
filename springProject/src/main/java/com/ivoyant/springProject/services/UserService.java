package com.ivoyant.springProject.services;

import com.ivoyant.springProject.models.AppUsers;
import com.ivoyant.springProject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserServiceInterface{

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public AppUsers save(AppUsers user) {
        return userRepository.save(user);
    }

    @Override
    public AppUsers validateUser(String email, String password) {
        return userRepository.findByEmailAndPassword(email,password);
    }
}

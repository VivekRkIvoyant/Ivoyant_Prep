package com.ivoyant.SpringSecurity.services;

import com.ivoyant.SpringSecurity.models.AppUsers;
import com.ivoyant.SpringSecurity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class AppUserService {

    private UserRepository userRepository;

    private static final PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    @Autowired
    public AppUserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public void saveNewUser(AppUsers user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRoles(Arrays.asList("USER"));
        userRepository.save(user);
    }

    public void createUser(AppUsers appUser){
        userRepository.save(appUser);
    }

    public List<AppUsers> findAllUsers(){
        return userRepository.findAll();
    }

    public AppUsers findUserById(Long id){
        return userRepository.findById(id).orElse(null);
    }

    public void deleteUserById(Long id){
        userRepository.deleteById(id);
    }
}

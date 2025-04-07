package com.ivoyant.JWTAuth.controller;

import com.ivoyant.JWTAuth.models.AppUsers;
import com.ivoyant.JWTAuth.services.AppUserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

    private final AppUserService userService;

    public AdminController(AppUserService userService){
        this.userService = userService;
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<AppUsers>> getAllUsers(){
        List<AppUsers> appUsers = userService.findAllUsers();
        if(appUsers.isEmpty()){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(appUsers,HttpStatus.FOUND);
    }
}

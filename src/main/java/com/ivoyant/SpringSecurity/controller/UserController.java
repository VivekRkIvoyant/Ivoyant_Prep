package com.ivoyant.SpringSecurity.controller;


import com.ivoyant.SpringSecurity.models.AppUsers;
import com.ivoyant.SpringSecurity.services.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private AppUserService appUserService;

    @Autowired
    public UserController(AppUserService appUserService){
        this.appUserService = appUserService;
    }


    @GetMapping("/test")
    public String testPoint(){
        return "this is test end point";
    }

    @PostMapping("/post")
    public ResponseEntity<AppUsers> addUser(@RequestBody AppUsers user){
       try {
           if(user==null){
               return new ResponseEntity<>(HttpStatus.NO_CONTENT);
           }
           appUserService.createUser(user);
           return new ResponseEntity<>(user,HttpStatus.CREATED);
       }catch (Exception e){
           e.printStackTrace();
           throw new RuntimeException(e.getMessage());
       }
    }

    @GetMapping("/{id}")
    public ResponseEntity<AppUsers> getById(@PathVariable Long id){
        AppUsers user = appUserService.findUserById(id);
        if(user==null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(user,HttpStatus.FOUND);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<AppUsers>> getAllUsers(){
        List<AppUsers> appUsers = appUserService.findAllUsers();
        if(appUsers.isEmpty()){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(appUsers,HttpStatus.FOUND);
    }

    @DeleteMapping("/{id}")
    public void deleteUsingId(Long id){
        appUserService.deleteUserById(id);
    }



//    new controllers

    @PostMapping("/new")
    public ResponseEntity<AppUsers> addNewUsers(@RequestBody AppUsers user){
        if(user==null){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        appUserService.saveNewUser(user);
        return new ResponseEntity<>(user,HttpStatus.CREATED);
    }
}

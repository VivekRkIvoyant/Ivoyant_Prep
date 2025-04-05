package com.ivoyant.JWTAuth.controller;

import com.ivoyant.JWTAuth.models.AppUsers;
import com.ivoyant.JWTAuth.services.AppUserService;
import com.ivoyant.JWTAuth.utility.JwtUtility;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@Slf4j
public class UserController {

    private final AppUserService appUserService;
    private final AuthenticationManager authenticationManager;
    private final UserDetailsService userDetailsService;
    private final JwtUtility jwtUtility;

    @Autowired
    public UserController(AppUserService appUserService,
                          AuthenticationManager authenticationManager,
                          UserDetailsService userDetailsService,
                          JwtUtility jwtUtility) {
        this.appUserService = appUserService;
        this.authenticationManager = authenticationManager;
        this.userDetailsService = userDetailsService;
        this.jwtUtility = jwtUtility;
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
    @PostMapping("/signup")
    public ResponseEntity<AppUsers> signup(@RequestBody AppUsers user){
        if(user==null){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        appUserService.saveNewUser(user);
        return new ResponseEntity<>(user,HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody AppUsers user){
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(user.getUserName(),user.getPassword()));
            UserDetails userDetails = userDetailsService.loadUserByUsername(user.getUserName());
            String jwt = jwtUtility.generateToken(userDetails.getUsername());
            return new ResponseEntity<>(jwt,HttpStatus.OK);
        }catch (Exception e){
            log.error("Exception occurred while createAuthenticationToken: "+e);
            return new ResponseEntity<>("Incorrect username or password",HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/auth/test")
    public ResponseEntity<String> authEndPoint(){
        String message = "end point working fine";
        return new ResponseEntity<>(message,HttpStatus.OK);
    }
}




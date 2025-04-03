package com.ivoyant.springProject.services;

import com.ivoyant.springProject.models.AppUsers;

public interface UserServiceInterface{

    AppUsers save(AppUsers user);

    AppUsers validateUser(String email,String password);
}

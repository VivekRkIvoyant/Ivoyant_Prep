package com.ivoyant.JWTAuth.repository;


import com.ivoyant.JWTAuth.models.AppUsers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<AppUsers,Long> {

    AppUsers findByUserName(String name);
}

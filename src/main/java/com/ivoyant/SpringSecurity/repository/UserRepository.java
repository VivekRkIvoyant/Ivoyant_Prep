package com.ivoyant.SpringSecurity.repository;

import com.ivoyant.SpringSecurity.models.AppUsers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<AppUsers,Long> {

    AppUsers findByUserName(String name);
}

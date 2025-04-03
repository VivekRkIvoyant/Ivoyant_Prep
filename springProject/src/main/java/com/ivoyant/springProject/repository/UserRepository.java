package com.ivoyant.springProject.repository;

import com.ivoyant.springProject.models.AppUsers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<AppUsers,Long> {

    AppUsers findByEmailAndPassword(String email,String password);
}

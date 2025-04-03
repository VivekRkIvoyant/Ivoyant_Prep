package com.ivoyant.SpringApplication.repository;

import com.ivoyant.SpringApplication.models.Club;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClubRepository extends JpaRepository<Club,Long> {

    Optional<Club> findByTitle(String title);

    Optional<Club> findByContent(String content);

    Optional<Club> findByCategory(String category);

}

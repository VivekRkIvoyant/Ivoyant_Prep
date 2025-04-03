package com.ivoyant.SpringApplication.controller;

import com.ivoyant.SpringApplication.models.Club;
import com.ivoyant.SpringApplication.service.ClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/clubs")
public class ClubController {

    @Autowired
    private ClubService clubService;

    public ClubController(ClubService clubService){
        this.clubService = clubService;
    }

    @GetMapping("/{id}")
    public Club getClubById(@PathVariable Long id){
        return clubService.findClubById(id);
    }

    @PostMapping
    public void addClubs(@RequestBody Club club){
        clubService.addClub(club);
    }

    @GetMapping("/get/all")
    public List<Club> getAllClubs(){
        return clubService.getAllClubs();
    }

    @DeleteMapping("/{id}")
    public String deleteClubs(@PathVariable Long id){
        clubService.deleteClubById(id);
        return "Club Deleted";
    }

    @GetMapping("/title/{title}")
    public Optional<Club> getClubByTitle(@PathVariable String title){
        return clubService.findByTitle(title);
    }

    @GetMapping("/content/{content}")
    public Optional<Club> getClubByContent(@PathVariable String content){
        return clubService.findByContent(content);
    }

    @GetMapping("/category/{category}")
    public Optional<Club> getClubByCategory(@PathVariable String category){
        return clubService.findByCategory(category);
    }
}

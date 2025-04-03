package com.ivoyant.SpringApplication.service;

import com.ivoyant.SpringApplication.dto.ClubDTO;
import com.ivoyant.SpringApplication.models.Club;
import com.ivoyant.SpringApplication.repository.ClubRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ClubService {


    private ClubRepository clubRepository;

    @Autowired
    public ClubService(ClubRepository clubRepository){
        this.clubRepository = clubRepository;
    }


    @Transactional
    public ResponseEntity<Club> addClub(Club club){
        Club saveClub = clubRepository.save(club);
        return new ResponseEntity<>(saveClub, HttpStatus.CREATED);
    }

    @Transactional
    public ResponseEntity<Club> updateClub(Long id, Club updatedClub) {
        return clubRepository.findById(id)
                .map(club -> {
                    club.setTitle(updatedClub.getTitle());
                    club.setPhotoURL(updatedClub.getPhotoURL());
                    club.setContent(updatedClub.getContent());
                    clubRepository.save(club);
                    return new ResponseEntity<>(club, HttpStatus.OK);
                })
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }


//    private JdbcTemplate jdbcTemplate;
//
//    @Autowired
//    public ClubService(JdbcTemplate jdbcTemplate){
//        this.jdbcTemplate = jdbcTemplate;
//    }

//    public void addClubs(Club club){
//        String query = "INSERT INTO clubs (title,photoURL,content,created_on,updated_on) VALUES (?,?,?,NOW(),NOW())";
//        jdbcTemplate.update(query,club.getTitle(),club.getPhotoURL(),club.getContent());
//    }
//
//    public Club findClubsById(Long id){
//        String query = "SELECT * FROM clubs WHERE id = ?";
//        jdbcTemplate.queryForObject(query,)
//
//    }

//    public ResponseEntity<List<Club>> getAllClubs() {
//        List<Club> clubs = clubRepository.findAll();
//        if (clubs.isEmpty()) {
//            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//        }
//        return new ResponseEntity<>(clubs, HttpStatus.OK);
//    }


    public Club findClubById(Long id){
        Club club = clubRepository.findById(id).orElse(null);
        if(club==null){
            return null;
        }
        return club;
    }

    @ExceptionHandler(ClubNotFoundException.class)
    public List<Club> getAllClubs(){
        return clubRepository.findAll();
    }

    public Optional<Club> findByTitle(String title){
        return clubRepository.findByTitle(title);
    }

    public Optional<Club> findByContent(String content){
        return clubRepository.findByContent(content);
    }

    @Transactional
    public void deleteClubById(Long id){
        clubRepository.deleteById(id);
    }

    public Optional<Club> findByCategory(String category){
        Optional<Club> list = clubRepository.findByCategory(category);
        if(list.isEmpty()){
            return Optional.empty();
        }
        return list;
    }
}

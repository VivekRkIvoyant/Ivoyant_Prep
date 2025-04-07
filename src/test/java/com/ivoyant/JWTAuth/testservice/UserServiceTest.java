package com.ivoyant.JWTAuth.testservice;

import com.ivoyant.JWTAuth.repository.UserRepository;
import com.ivoyant.JWTAuth.services.AppUserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@Slf4j
@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AppUserService userService;


    @Test
    public void testAdd(){
        assertEquals(4,2+2);
    }

    @Test
    public void testList(){
        assertFalse(userRepository.findAll().isEmpty());
    }

    @Disabled
    @Test
    public void testName(){

    }

    @BeforeEach
    public void runBeforeEach(){
//        runs before each test case;
        log.info("Hello before each method");
    }

    @BeforeAll
    public static void runBeforeAll(){
//        runs before all test cases start running;
        log.info("Hello there");
    }

    @AfterEach
    public void runAfterEach(){
//        runs after every test case gets completed;
    }
}

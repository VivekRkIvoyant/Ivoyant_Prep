package com.ivoyant.JWTAuth.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "USER_DETAILS")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AppUsers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    private String userName;
    @NonNull
    private String password;

    private String email;

    private String city;

    private List<String> roles;

}


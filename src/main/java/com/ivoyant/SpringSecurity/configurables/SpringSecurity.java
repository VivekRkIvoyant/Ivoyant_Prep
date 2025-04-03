package com.ivoyant.SpringSecurity.configurables;

import com.ivoyant.SpringSecurity.services.CustomUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import java.util.List;

@Configuration
@EnableWebSecurity
public class SpringSecurity{

    @Autowired
    private CustomUserDetailsService customUserDetailsService;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(AbstractHttpConfigurer::disable)
                .authorizeHttpRequests(auth->auth
                        .requestMatchers("/api/users/new").permitAll()
                        .requestMatchers("/api/users/**").authenticated()
                        .anyRequest().permitAll()
                )
//                in case if you want additional or external login form
//              .formLogin(form->form
//                        .loginPage("/login").permitAll()
//                )
                .httpBasic(httpBasic->{});
        return http.build();
    }

    @Bean
    public AuthenticationManager authenticationManager() throws Exception{
        DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
        authProvider.setUserDetailsService(customUserDetailsService);
        authProvider.setPasswordEncoder(passwordEncoderFunction());
        return new ProviderManager(List.of(authProvider));
    }

    @Bean
    public PasswordEncoder passwordEncoderFunction(){
        return new BCryptPasswordEncoder();
    }
}


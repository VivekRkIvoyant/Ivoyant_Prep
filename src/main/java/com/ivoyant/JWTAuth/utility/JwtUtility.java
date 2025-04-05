package com.ivoyant.JWTAuth.utility;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
public class JwtUtility {

    private SecretKey getSigningKey(){
        String SECRET_KEY = "Tak+HaV^uvCHEFsEVfypW#7g9^k*Z8$V";
        return Keys.hmacShaKeyFor(SECRET_KEY.getBytes());
    }

    public String extractUsername(String token){
        return extractAllClaims(token).getSubject();
    }

    public Date extractExpiration(String token){
        return extractAllClaims(token).getExpiration();
    }

    public Object extractClaim(String token, String claim) {
        return extractAllClaims(token).get(claim);
    }

    public Claims extractAllClaims(String token){
        return Jwts.parser()
                .verifyWith(getSigningKey())
                .build()
                .parseSignedClaims(token)
                .getPayload();
    }

    private Boolean isTokenExpired(String token){
        return extractExpiration(token).before(new Date());
    }

    public String generateToken(String username){
        Map<String, Object> claims = new HashMap<>();
        return createToken(claims, username);
    }

    public String createToken(Map<String,Object> claims, String subject){
        return Jwts.builder()
                .claims(claims)
                .subject(subject)
                .header().add("typ","JWT")
                .and()
                .issuedAt(new Date(System.currentTimeMillis()))
                .expiration(new Date(System.currentTimeMillis() + 1000 * 60 * 5))
                .signWith(getSigningKey())
                .compact();
    }

    public Boolean validateToken(String token, String username){
        final String extractedUsername = extractUsername(token);
        return (extractedUsername.equals(username) && !isTokenExpired(token));
    }
}

package com.stefanini.springboot.app.auth.service;

import java.io.IOException;
import java.util.Collection;

import org.springframework.security.core.Authentication;

import io.jsonwebtoken.Claims;
import org.springframework.security.core.GrantedAuthority;

public interface JWTService {

    public String create(Authentication auth) throws IOException;
    public boolean validate(String token);
    public Claims getClaims(String token);
    public String getUsername(String token);
    public Collection<? extends GrantedAuthority> getRoles(String token) throws IOException;
    public String resolve(String token);
}

package com.codingshuttle.projects.lovable_clone.service;

import com.codingshuttle.projects.lovable_clone.dto.auth.AuthResponse;
import com.codingshuttle.projects.lovable_clone.dto.auth.LoginRequest;
import com.codingshuttle.projects.lovable_clone.dto.auth.SignupRequest;
import com.codingshuttle.projects.lovable_clone.dto.auth.UserProfileResponse;
import org.springframework.http.ResponseEntity;

public interface AuthService {
    AuthResponse getAuthentication(SignupRequest signupRequest);

    UserProfileResponse getLogin(LoginRequest loginRequest);
}

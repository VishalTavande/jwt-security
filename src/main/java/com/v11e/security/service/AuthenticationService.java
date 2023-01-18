package com.v11e.security.service;

import com.v11e.security.dto.AuthenticationRequest;
import com.v11e.security.dto.AuthenticationResponse;
import com.v11e.security.dto.RegisterRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {

    public AuthenticationResponse register(RegisterRequest request) {

    }

    public AuthenticationResponse authenticate(AuthenticationRequest request) {
    }
}

package com.shashwathsh.lovable_clone.Service.impl;

import com.shashwathsh.lovable_clone.Service.AuthService;
import com.shashwathsh.lovable_clone.dto.auth.AuthResponse;
import com.shashwathsh.lovable_clone.dto.auth.LoginRequest;
import com.shashwathsh.lovable_clone.dto.auth.SignupRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class AuthServiceImpl implements AuthService {
    @Override
    public @Nullable AuthResponse signup(SignupRequest request) {
        return null;
    }

    @Override
    public @Nullable AuthResponse login(LoginRequest request) {
        return null;
    }
}

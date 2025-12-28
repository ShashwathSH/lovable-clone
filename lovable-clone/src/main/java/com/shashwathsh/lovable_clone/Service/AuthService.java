package com.shashwathsh.lovable_clone.Service;

import com.shashwathsh.lovable_clone.dto.auth.AuthResponse;
import com.shashwathsh.lovable_clone.dto.auth.LoginRequest;
import com.shashwathsh.lovable_clone.dto.auth.SignupRequest;
import org.jspecify.annotations.Nullable;

public interface AuthService {
    @Nullable AuthResponse signup(SignupRequest request);

    @Nullable AuthResponse login(LoginRequest request);
}

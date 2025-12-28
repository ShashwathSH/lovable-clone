package com.shashwathsh.lovable_clone.dto.auth;

public record SignupRequest(
        String email,
        String name,
        String password
) {
}

package com.shashwathsh.lovable_clone.dto.auth;

public record LoginRequest(
        String email,
        String password
) {
}

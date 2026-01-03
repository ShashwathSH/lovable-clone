package com.shashwathsh.lovable_clone.dto.project;

import com.shashwathsh.lovable_clone.dto.auth.UserProfileResponse;

import java.time.Instant;

public record ProjectResponse(
        Long id,
        String name,
        String email,
        Instant createdAt,
        Instant updatedAt,
        UserProfileResponse owner
) {
}

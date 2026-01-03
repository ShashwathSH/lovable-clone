package com.shashwathsh.lovable_clone.dto.project;

import java.time.Instant;

public record ProjectSummaryResponse(
        Long id,
        String name,
        String email,
        Instant createdAt,
        Instant updatedAt
)  {
}

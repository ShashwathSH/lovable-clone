package com.shashwathsh.lovable_clone.dto.subscription;

public record PlanLimitsResponse(
        String planName,
        int macTokensPerDay,
        int maxProjects,
        Boolean unlimitedAi
) {
}

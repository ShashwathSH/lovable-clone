package com.shashwathsh.lovable_clone.dto.subscription;

public record PlanLimitsResponse(
        String planName,
        Integer macTokensPerDay,
        Integer maxProjects,
        Boolean unlimitedAi
) {
}

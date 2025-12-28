package com.shashwathsh.lovable_clone.dto.subscription;

import org.hibernate.sql.ast.tree.insert.InsertStatement;

import java.time.Instant;

public record SubscriptionResponse(
        PlanResponse plan,
        String status,
        Instant periodEnd,
        Long tokenUsedThisCycle
) {
}

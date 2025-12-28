package com.shashwathsh.lovable_clone.Service;

import com.shashwathsh.lovable_clone.dto.subscription.PlanLimitsResponse;
import com.shashwathsh.lovable_clone.dto.subscription.UsageTodayResponse;
import org.jspecify.annotations.Nullable;

public interface UsageService {
    UsageTodayResponse getTodayUsageOfUser(Long userId);


    PlanLimitsResponse getCurrentSubscriptionOfUser(Long userId);
}

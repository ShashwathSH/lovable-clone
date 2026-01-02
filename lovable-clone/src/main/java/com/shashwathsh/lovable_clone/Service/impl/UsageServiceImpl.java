package com.shashwathsh.lovable_clone.Service.impl;

import com.shashwathsh.lovable_clone.Service.UsageService;
import com.shashwathsh.lovable_clone.dto.subscription.PlanLimitsResponse;
import com.shashwathsh.lovable_clone.dto.subscription.UsageTodayResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class UsageServiceImpl implements UsageService {

    @Override
    public UsageTodayResponse getTodayUsageOfUser(Long userId) {
        return null;
    }

    @Override
    public PlanLimitsResponse getCurrentSubscriptionOfUser(Long userId) {
        return null;
    }
}

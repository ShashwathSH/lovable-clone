package com.shashwathsh.lovable_clone.controller;

import com.shashwathsh.lovable_clone.Service.UsageService;
import com.shashwathsh.lovable_clone.dto.subscription.PlanLimitsResponse;
import com.shashwathsh.lovable_clone.dto.subscription.UsageTodayResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/usage/")
@RequiredArgsConstructor
public class UsageController {

    private final UsageService usageService;


    @GetMapping("/today")
    public ResponseEntity<UsageTodayResponse> getTodayUsage(){
        Long userId = 1L;
        return ResponseEntity.ok(usageService.getTodayUsageOfUser(userId));
    }

    @GetMapping("/limits")
    public ResponseEntity<PlanLimitsResponse> getPlanLimits(){
        Long userId = 1L;
        return ResponseEntity.ok(usageService.getCurrentSubscriptionOfUser(userId));
    }

}

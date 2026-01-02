package com.shashwathsh.lovable_clone.Service.impl;

import com.shashwathsh.lovable_clone.Service.PlanService;
import com.shashwathsh.lovable_clone.dto.subscription.PlanResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class PlanServiceImpl implements PlanService {
    @Override
    public List<PlanResponse> getAllActivePlans() {
        return List.of();
    }
}

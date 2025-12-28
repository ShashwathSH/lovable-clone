package com.shashwathsh.lovable_clone.Service;

import com.shashwathsh.lovable_clone.dto.subscription.PlanResponse;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface PlanService {
    List<PlanResponse> getAllActivePlans();
}

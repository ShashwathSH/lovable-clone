package com.shashwathsh.lovable_clone.Service.impl;

import com.shashwathsh.lovable_clone.Service.SubscriptionService;
import com.shashwathsh.lovable_clone.dto.subscription.CheckoutRequest;
import com.shashwathsh.lovable_clone.dto.subscription.CheckoutResponse;
import com.shashwathsh.lovable_clone.dto.subscription.PortalResponse;
import com.shashwathsh.lovable_clone.dto.subscription.SubscriptionResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class SubscriptionServiceImpl implements SubscriptionService {
    @Override
    public SubscriptionResponse getCurrentSubscription(Long userId) {
        return null;
    }

    @Override
    public CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request, Long userId) {
        return null;
    }

    @Override
    public PortalResponse openCustomerPortal(Long userId) {
        return null;
    }
}

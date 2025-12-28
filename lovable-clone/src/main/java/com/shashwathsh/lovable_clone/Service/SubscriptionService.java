package com.shashwathsh.lovable_clone.Service;

import com.shashwathsh.lovable_clone.dto.subscription.CheckoutRequest;
import com.shashwathsh.lovable_clone.dto.subscription.CheckoutResponse;
import com.shashwathsh.lovable_clone.dto.subscription.PortalResponse;
import com.shashwathsh.lovable_clone.dto.subscription.SubscriptionResponse;
import org.jspecify.annotations.Nullable;

public interface SubscriptionService {
    SubscriptionResponse getCurrentSubscription(Long userId);


    CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request, Long userId);

    PortalResponse openCustomerPortal(Long userId);
}

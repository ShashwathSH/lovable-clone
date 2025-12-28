package com.shashwathsh.lovable_clone.Service;

import com.shashwathsh.lovable_clone.dto.auth.UserProfileResponse;
import org.jspecify.annotations.Nullable;

public interface UserService {
    UserProfileResponse getProfile(Long userId);
}

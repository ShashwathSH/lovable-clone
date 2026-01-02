package com.shashwathsh.lovable_clone.Service.impl;

import com.shashwathsh.lovable_clone.Service.UserService;
import com.shashwathsh.lovable_clone.dto.auth.UserProfileResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserServiceImpl implements UserService{
    @Override
    public UserProfileResponse getProfile(Long userId) {
        return null;
    }
}

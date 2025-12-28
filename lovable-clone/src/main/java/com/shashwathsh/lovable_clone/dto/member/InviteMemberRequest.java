package com.shashwathsh.lovable_clone.dto.member;

import com.shashwathsh.lovable_clone.enums.ProjectRole;

public record InviteMemberRequest(
        String email,
        ProjectRole role
) {
}

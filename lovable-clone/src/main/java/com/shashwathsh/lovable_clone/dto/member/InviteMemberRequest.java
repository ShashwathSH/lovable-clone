package com.shashwathsh.lovable_clone.dto.member;

import com.shashwathsh.lovable_clone.enums.ProjectRole;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.NoArgsConstructor;

public record InviteMemberRequest(
        @Email @NotBlank String email,
        @NotNull ProjectRole role
) {
}

package com.shashwathsh.lovable_clone.Service;

import com.shashwathsh.lovable_clone.dto.member.InviteMemberRequest;
import com.shashwathsh.lovable_clone.dto.member.MemberResponse;
import com.shashwathsh.lovable_clone.dto.member.UpdateMemberRoleRequest;
import com.shashwathsh.lovable_clone.entity.ProjectMember;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface ProjectMemberService {
    List<ProjectMember> getProjectMembers(Long projectId, Long userId);

    MemberResponse inviteMember(Long projectId, InviteMemberRequest request, Long userId);

    MemberResponse updateMemberRole(Long projectId, Long memberId, UpdateMemberRoleRequest request);

    MemberResponse deleteProjectMember(Long projectId, Long memberId);
}

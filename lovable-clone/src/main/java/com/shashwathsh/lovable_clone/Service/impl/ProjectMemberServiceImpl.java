package com.shashwathsh.lovable_clone.Service.impl;


import com.shashwathsh.lovable_clone.Service.ProjectMemberService;
import com.shashwathsh.lovable_clone.dto.member.InviteMemberRequest;
import com.shashwathsh.lovable_clone.dto.member.MemberResponse;
import com.shashwathsh.lovable_clone.dto.member.UpdateMemberRoleRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProjectMemberServiceImpl implements ProjectMemberService {
    @Override
    public List<MemberResponse> getProjectMembers(Long projectId, Long userId) {
        return List.of();
    }

    @Override
    public MemberResponse inviteMember(Long projectId, InviteMemberRequest request, Long userId) {
        return null;
    }

    @Override
    public MemberResponse updateMemberRole(Long projectId, Long memberId, UpdateMemberRoleRequest request, Long userId) {
        return null;
    }

    @Override
    public MemberResponse deleteProjectMember(Long projectId, Long memberId) {
        return null;
    }
}

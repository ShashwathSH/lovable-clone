package com.shashwathsh.lovable_clone.mapper;

import com.shashwathsh.lovable_clone.dto.member.MemberResponse;
import com.shashwathsh.lovable_clone.entity.ProjectMember;
import com.shashwathsh.lovable_clone.entity.User;
import com.shashwathsh.lovable_clone.enums.ProjectRole;
import java.time.Instant;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-03T13:17:44+0530",
    comments = "version: 1.6.3, compiler: javac, environment: Java 25.0.1 (Eclipse Adoptium)"
)
@Component
public class ProjectMemberMapperImpl implements ProjectMemberMapper {

    @Override
    public MemberResponse toProjectMemberResponseFromOwner(User owner) {
        if ( owner == null ) {
            return null;
        }

        Long userId = null;
        String email = null;
        String name = null;

        userId = owner.getId();
        email = owner.getEmail();
        name = owner.getName();

        ProjectRole projectRole = ProjectRole.OWNER;
        Instant invitedAt = null;

        MemberResponse memberResponse = new MemberResponse( userId, email, name, projectRole, invitedAt );

        return memberResponse;
    }

    @Override
    public MemberResponse toProjectMemberResponseFromMember(ProjectMember projectMember) {
        if ( projectMember == null ) {
            return null;
        }

        Long userId = null;
        String email = null;
        String name = null;
        ProjectRole projectRole = null;
        Instant invitedAt = null;

        userId = projectMemberUserId( projectMember );
        email = projectMemberUserEmail( projectMember );
        name = projectMemberUserName( projectMember );
        projectRole = projectMember.getProjectRole();
        invitedAt = projectMember.getInvitedAt();

        MemberResponse memberResponse = new MemberResponse( userId, email, name, projectRole, invitedAt );

        return memberResponse;
    }

    private Long projectMemberUserId(ProjectMember projectMember) {
        User user = projectMember.getUser();
        if ( user == null ) {
            return null;
        }
        return user.getId();
    }

    private String projectMemberUserEmail(ProjectMember projectMember) {
        User user = projectMember.getUser();
        if ( user == null ) {
            return null;
        }
        return user.getEmail();
    }

    private String projectMemberUserName(ProjectMember projectMember) {
        User user = projectMember.getUser();
        if ( user == null ) {
            return null;
        }
        return user.getName();
    }
}

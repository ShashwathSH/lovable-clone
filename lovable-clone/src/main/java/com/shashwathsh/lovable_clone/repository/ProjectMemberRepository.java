package com.shashwathsh.lovable_clone.repository;

import com.shashwathsh.lovable_clone.entity.ProjectMember;
import com.shashwathsh.lovable_clone.entity.ProjectMemberId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectMemberRepository extends JpaRepository<ProjectMember, ProjectMemberId> {

//    @Query("select p from ProjectMember p where p.id = ?1")
    List<ProjectMember> findByIdProjectId(Long projectId);

}

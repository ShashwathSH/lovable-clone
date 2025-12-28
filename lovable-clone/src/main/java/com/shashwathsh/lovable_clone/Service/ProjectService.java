package com.shashwathsh.lovable_clone.Service;

import com.shashwathsh.lovable_clone.dto.project.ProjectRequest;
import com.shashwathsh.lovable_clone.dto.project.ProjectResponse;
import com.shashwathsh.lovable_clone.dto.project.ProjectSummaryResponse;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface ProjectService {

    static  List<ProjectSummaryResponse> getUserProjects(Long userId) {
        return null;
    }


    ProjectResponse getUserProjectById(Long id, Long userId);

    ProjectResponse createProject(ProjectRequest request, Long userId);

    ProjectResponse updateProject(Long id, ProjectRequest request, Long userId);

    void softDelete(Long id, Long userId);
}

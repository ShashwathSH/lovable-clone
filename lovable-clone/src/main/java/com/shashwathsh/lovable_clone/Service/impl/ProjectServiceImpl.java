package com.shashwathsh.lovable_clone.Service.impl;

import com.shashwathsh.lovable_clone.Service.ProjectService;
import com.shashwathsh.lovable_clone.dto.project.ProjectRequest;
import com.shashwathsh.lovable_clone.dto.project.ProjectResponse;
import com.shashwathsh.lovable_clone.dto.project.ProjectSummaryResponse;
import com.shashwathsh.lovable_clone.entity.Project;
import com.shashwathsh.lovable_clone.entity.User;
import com.shashwathsh.lovable_clone.mapper.ProjectMapper;
import com.shashwathsh.lovable_clone.repository.ProjectRepository;
import com.shashwathsh.lovable_clone.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
@FieldDefaults(level = AccessLevel.PRIVATE,makeFinal = true)
@Transactional
public class ProjectServiceImpl implements ProjectService {

    ProjectRepository projectRepository;
    UserRepository userRepository;
    ProjectMapper projectMapper;

    @Override
    public ProjectResponse createProject(ProjectRequest request, Long userId) {
        User owner = userRepository.findById(userId).orElseThrow();
        // Creating a new Project entity using the builder pattern with initial values
        // provided from the request and setting default visibility.

        Project project = Project.builder()
                .name(request.name())
                .owner(owner)
                .isPublic(false)
                .build();

        project = projectRepository.save(project);
        return projectMapper.toProjectResponse(project);
    }

    @Override
    public List<ProjectSummaryResponse> getUserProjects(Long userId) {
//        return projectRepository.findAllAccessibleByUser(userId)
//                .stream()
//                .map(projectMapper::toProjectSummaryResponse)
//                .collect(Collectors.toList());

        var projects = projectRepository.findAllAccessibleByUser(userId);
        return projectMapper.toListOfProjectSummaryResponse(projects);
    }

    @Override
    public ProjectResponse getUserProjectById(Long id, Long userId) {
        return null;
    }

    @Override
    public ProjectResponse updateProject(Long id, ProjectRequest request, Long userId) {
        return null;
    }

    @Override
    public void softDelete(Long id, Long userId) {

    }
}

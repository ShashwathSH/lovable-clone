package com.shashwathsh.lovable_clone.mapper;

import com.shashwathsh.lovable_clone.Service.ProjectService;
import com.shashwathsh.lovable_clone.dto.project.ProjectResponse;
import com.shashwathsh.lovable_clone.dto.project.ProjectSummaryResponse;
import com.shashwathsh.lovable_clone.entity.Project;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Optional;


// MapStruct is used because records are immutable and ModelMapper relies on setters.

@Mapper(componentModel = "spring")
public interface ProjectMapper {

    ProjectResponse toProjectResponse(Project project);

    ProjectSummaryResponse toProjectSummaryResponse(Project project);

    List<ProjectSummaryResponse> toListOfProjectSummaryResponse(List<Project> projects);

}

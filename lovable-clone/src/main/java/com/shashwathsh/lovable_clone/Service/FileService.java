package com.shashwathsh.lovable_clone.Service;

import com.shashwathsh.lovable_clone.dto.project.FileContentResponse;
import com.shashwathsh.lovable_clone.dto.project.FileNode;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface FileService {
    List<FileNode> getFileTree(Long projectId, Long userId);

    FileContentResponse getFileContent(Long projectId, Long userId);
}

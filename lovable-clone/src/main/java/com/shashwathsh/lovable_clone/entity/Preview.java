package com.shashwathsh.lovable_clone.entity;

import com.shashwathsh.lovable_clone.enums.PreviewStatus;

import java.time.Instant;

public class Preview {
    Long id;
    Project project;
    String namespace;
    String podName;
    String previewUrl;
    Instant startedAt;
    Instant terminatedAt;
    Instant createdAt;
    PreviewStatus status;

}

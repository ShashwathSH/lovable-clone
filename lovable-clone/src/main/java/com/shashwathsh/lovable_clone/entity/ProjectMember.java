package com.shashwathsh.lovable_clone.entity;

import com.shashwathsh.lovable_clone.enums.ProjectRole;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "project_members")
public class ProjectMember {
    @EmbeddedId
    ProjectMemberId id;

    ///  I could have used Many to Many, but extra fields like role, invitedAt and acceptedAt will be omitted,
    /// In this project I need those fields, So Many to Many is not feasible, Thats why I'm using Many to One and also MapsId
    @ManyToOne
//    @JoinColumn(name = "project_id")
    @MapsId("projectId") // This will map the above project member id to projectId
    Project project;

    @ManyToOne
//    @JoinColumn(name = "user_id")
    @MapsId("userId")
    User user;

    @Enumerated
    @Column(nullable = false)
    ProjectRole projectRole;

    Instant invitedAt;
    Instant acceptedAt;

}

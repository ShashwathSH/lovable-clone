package com.shashwathsh.lovable_clone.repository;

import com.shashwathsh.lovable_clone.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectRepository extends JpaRepository<Project,Long> {


    // We dont have to do the implementation, JPA will do it for us

    @Query("""
              SELECT p FROM Project p
              WHERE p.deletedAt is NULL
              AND p.owner.id = :userId
              ORDER BY p.updatedAt DESC
            """
    )
    List<Project> findAllAccessibleByUser(@Param("userId") Long userId);


}

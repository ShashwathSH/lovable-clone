package com.shashwathsh.lovable_clone.repository;

import com.shashwathsh.lovable_clone.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    @Query("select u from User u where u.email like ?1")
    Optional<User> findByEmail(String email);

}

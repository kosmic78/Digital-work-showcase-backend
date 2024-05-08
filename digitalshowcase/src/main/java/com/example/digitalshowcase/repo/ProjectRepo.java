package com.example.digitalshowcase.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.digitalshowcase.model.Project;

import java.util.Optional;

public interface ProjectRepo extends JpaRepository<Project, Long> {
    void deleteProjectById(Long id);

    Optional<Project> findProjectById(Long id);
}

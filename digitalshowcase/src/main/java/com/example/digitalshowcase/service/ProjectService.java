package com.example.digitalshowcase.service;

import com.example.digitalshowcase.exception.UserNotFoundException;
import com.example.digitalshowcase.repo.ProjectRepo;
import com.example.digitalshowcase.model.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;

import java.util.List;

@Service
@Transactional
public class ProjectService {
    private final ProjectRepo projectRepo;

    @Autowired
    public ProjectService(ProjectRepo projectRepo) {
        this.projectRepo = projectRepo;
    }

    public Project addProject(Project project) {
        return projectRepo.save(project);
    }

    public List<Project> findAllProjects() {
        return projectRepo.findAll();
    }

    public Project updateProject(Project project) {
        return projectRepo.save(project);
    }

    public Project findProjectById(Long id) {
        return projectRepo.findProjectById(id)
                .orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));
    }

    public void deleteProject(Long id){
        projectRepo.deleteProjectById(id);
    }
}

package com.b127.bug.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.b127.bug.entity.Project;

public interface ProjectRepository extends JpaRepository<Project, Long> {

}

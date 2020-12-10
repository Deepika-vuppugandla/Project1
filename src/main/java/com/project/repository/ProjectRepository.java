package com.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.model.Project;




public interface ProjectRepository extends JpaRepository<Project, Integer> {

	public Project findById(Project project);
	public List<Project> findAll();
	public Project save(Project project);
	public void deleteById(int id);
	


}

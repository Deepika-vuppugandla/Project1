package com.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.model.Project;
import com.project.repository.ProjectRepository;



@Service
public class ProjectService {
	@Autowired
	ProjectRepository dao;

	public Project projectById(int id)
	{
		Optional<Project> project=dao.findById(id);
		return project.get();
	}
	public List<Project> getAllprojects()
	{
		return dao.findAll();
	}
	public Project createProject(Project project)
	{
		return dao.save(project);
	}
	public void deleteProject(int id) {
	
		dao.deleteById(id);
	}
	public Project updateProject(Project project) {
		  
		  Optional<Project> update =dao.findById(project.getId());
		  Project p= update.get();
			p.setName(project.getName());
			p.setStatus(project.getStatus());
			return dao.save(project);
			
	  }
}

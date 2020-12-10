package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.model.Project;
import com.project.service.ProjectService;


@RestController
@RequestMapping(value="/")
public class ProjectController {

	@Autowired
	ProjectService service;
	@GetMapping("/hitest")
	public String sayhello()
	{
		return ("Hello");
	}
	
	@GetMapping("/projects")
	public List<Project> getProjects()
	{
		System.out.println("hi");
		//List projects=service.getAllprojects();
		System.out.println("projects");
		return service.getAllprojects();
	}
	@GetMapping("/projects/{id}")
	public Project getProjectById(@PathVariable int id) {
		return service.projectById(id);
		
	}
	@PostMapping("/project")
	public Project insertProject(@RequestBody Project p)
	{
		return service.createProject(p);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteProject(@PathVariable int id)
	{
		service.deleteProject(id);
		System.out.println("success");
	}
	@PutMapping("/updateproject")
	 public Project updateProject(@RequestBody Project project) {
		return service.updateProject(project);
		 
	 }
	
}

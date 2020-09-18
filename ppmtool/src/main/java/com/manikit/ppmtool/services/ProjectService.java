package com.manikit.ppmtool.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manikit.ppmtool.demo.Project;
import com.manikit.ppmtool.repositories.ProjectRepository;

@Service
public class ProjectService {

	@Autowired
	private ProjectRepository projectRepository;
	
	
	public Project saveOrUpdateProject(Project project) {
		
		// Logic 
		
		return projectRepository.save(project);
		
	
	}
}

package com.manikit.ppmtool.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.manikit.ppmtool.demo.Project;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long> {
	
}

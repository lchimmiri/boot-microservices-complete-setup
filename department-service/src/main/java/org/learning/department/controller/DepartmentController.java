package org.learning.department.controller;

import org.learning.department.entity.Department;
import org.learning.department.service.DepartmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
	private static final Logger log = LoggerFactory.getLogger(DepartmentController.class);

	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping("/")
	public Department saveDepartment(@RequestBody Department department) {
		log.info("Inside saveDepartment method of DepartmentController");
		return departmentService.saveDepartment(department);
	}
	
	@GetMapping("/{id}")
	public Department findDepartmentById(@PathVariable("id") Long departmentId) {
		log.info("Inside saveDepartment method of DepartmentController");
		return departmentService.findDepartmentById(departmentId);
	}
}

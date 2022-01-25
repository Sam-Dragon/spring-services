package com.example.department;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Department;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

	@Autowired
	private DepartmentService service;

	@PostMapping
	public Department saveDepartment(@RequestBody Department department) {
		log.info("Save Department :: " + department);
		return service.saveDepartment(department);
	}

	@GetMapping("/{id}")
	public Department getDepartmentById(@PathVariable("id") Long id) {
		log.info("Search Department :: " + id);
		return service.getDepartmentById(id);
	}
}

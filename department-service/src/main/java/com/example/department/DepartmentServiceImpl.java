package com.example.department;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Department;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentRepository repository;

	@Override
	public Department saveDepartment(Department department) {
		return repository.save(department);
	}

	@Override
	public Department getDepartmentById(Long id) {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		return repository.findById(id)
				.orElseThrow(() -> new RuntimeException("No such department is present with id : " + id));
	}
}

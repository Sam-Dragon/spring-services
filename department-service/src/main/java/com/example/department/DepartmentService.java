package com.example.department;

import com.example.entity.Department;

public interface DepartmentService {

	Department saveDepartment(Department department);

	Department getDepartmentById(Long id);
}

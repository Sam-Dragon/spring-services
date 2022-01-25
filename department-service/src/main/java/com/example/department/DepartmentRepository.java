package com.example.department;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Department;

@Repository
public interface DepartmentRepository extends CrudRepository<Department, Long> {

	List<Department> findAll();
}

package com.go2it.edu.demo.repository;

import com.go2it.edu.demo.entity.Department;

public interface IDepartmentRepository {
    public Department findById(int id);
    public void save(Department department);
}

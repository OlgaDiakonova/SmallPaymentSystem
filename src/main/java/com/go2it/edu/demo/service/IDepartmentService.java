package com.go2it.edu.demo.service;

import com.go2it.edu.demo.entity.Department;

public interface IDepartmentService {
    public Department findById(int id);
    public void save(Department department);
}

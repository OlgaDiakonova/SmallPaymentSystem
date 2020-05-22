package com.go2it.edu.demo.repository;

import com.go2it.edu.demo.entity.Department;
import com.go2it.edu.demo.entity.dto.Result;

import java.util.List;

public interface IDepartmentRepository {
    public Department findById(int id);
    public void save(Department department);
    public List<Result> getEmployeeReport();
}

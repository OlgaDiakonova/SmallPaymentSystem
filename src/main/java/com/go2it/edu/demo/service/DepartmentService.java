package com.go2it.edu.demo.service;

import com.go2it.edu.demo.entity.Department;
import com.go2it.edu.demo.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DepartmentService implements IDepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department findById(int id) {
        return departmentRepository.findById(id);
    }

    @Transactional
    @Override
    public void save(Department department) {
        departmentRepository.save(department);
    }
}

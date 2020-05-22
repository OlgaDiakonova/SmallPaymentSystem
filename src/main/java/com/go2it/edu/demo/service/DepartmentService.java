package com.go2it.edu.demo.service;

import com.go2it.edu.demo.entity.Department;
import com.go2it.edu.demo.entity.dto.Result;
import com.go2it.edu.demo.repository.IDepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DepartmentService implements IDepartmentService {

    @Autowired
    private IDepartmentRepository departmentRepository;

    @Override
    public Department findById(int id) {
        return departmentRepository.findById(id);
        //return null;
    }


    @Override
    public void save(Department department) {
        departmentRepository.save(department);
    }

    @Override
    public List<Result> getEmployeeReport() {
       return departmentRepository.getEmployeeReport();
    }
}

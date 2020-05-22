package com.go2it.edu.demo.service;

import com.go2it.edu.demo.entity.Employee;
import com.go2it.edu.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService implements IEmplyoeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee findById(int id) {
        return employeeRepository.findById(id);
    }

//    @Override
//    @Transactional
//    public void save(Employee employee) {
//        employeeRepository.save(employee);
//    }
}

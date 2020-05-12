package com.go2it.edu.demo.repository;

import com.go2it.edu.demo.entity.Employee;

public interface IEmployeeRepository {

    public Employee findById(int id);
    public void save(Employee employee);
}

package com.go2it.edu.demo.service;

import com.go2it.edu.demo.entity.Employee;

public interface IEmplyoeeService {
    public Employee findById(int id);
    public void save(Employee employee);
}

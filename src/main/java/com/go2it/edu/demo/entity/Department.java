package com.go2it.edu.demo.entity;

import javax.persistence.*;
import java.util.List;

@Entity(name = "departments")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int department_id;
    private String department_name;

    @OneToMany(mappedBy = "departments", fetch = FetchType.EAGER)
    private List<Employee> employees;
    private int location_id;

    public Department() {
    }

    public int getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }


    public int getLocation_id() {
        return location_id;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public void setLocation_id(int location_id) {
        this.location_id = location_id;
    }

    @Override
    public String toString() {
        return "Department{" +
                "department_id=" + department_id +
                ", department_name='" + department_name + '\'' +
//                ", manager_id=" + manager_id +
//                ", location_id=" + location_id +
                '}';
    }
}

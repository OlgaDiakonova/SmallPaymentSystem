package com.go2it.edu.demo.entity.dto;

public class Result {
    private String department_name;
    private String employee_name;
    private double salary;

    public Result() {
    }

    public Result(String department_name, String employee_name, double salary) {
        this.department_name = department_name;
        this.employee_name = employee_name;
        this.salary = salary;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

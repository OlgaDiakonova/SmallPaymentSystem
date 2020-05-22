package com.go2it.edu.demo;

import com.go2it.edu.demo.entity.dto.Result;
import com.go2it.edu.demo.service.IDepartmentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
       //Payment pmnt = new Payment(123,"202003","Ivanov", 200.00);

//        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        Application application = (Application)context.getBean("application");
//        application.start(pmnt);
//        IDepartmentService departmentService = context.getBean(IDepartmentService.class);
//
//        System.out.println(departmentService.findById(60).toString());

//        Department department = new Department();
//        department.setDepartment_name("IT Support");
//        department.setLocation_id(1700);
//        department.setManager_id(103);

//        departmentService.save(department);

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        IDepartmentService departmentService = context.getBean(IDepartmentService.class);
        List<Result> resList = departmentService.getEmployeeReport();
        for (Result r: resList) {

            System.out.format("%s , %s, %8.2f \n", r.getDepartment_name(), r.getEmployee_name(), r.getSalary());

        }

    }
}

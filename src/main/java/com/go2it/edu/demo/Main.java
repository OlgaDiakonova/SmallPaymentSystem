package com.go2it.edu.demo;

import com.go2it.edu.demo.entity.Department;
import com.go2it.edu.demo.service.DepartmentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
       //Payment pmnt = new Payment(123,"202003","Ivanov", 200.00);

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        Application application = (Application)context.getBean("application");
//        application.start(pmnt);
        DepartmentService departmentService = context.getBean(DepartmentService.class);

        System.out.println(departmentService.findById(60).toString());

        Department department = new Department();
        department.setDepartment_name("IT Support");
        department.setLocation_id(1700);
        department.setManager_id(103);

        //departmentService.save(department);
    }
}

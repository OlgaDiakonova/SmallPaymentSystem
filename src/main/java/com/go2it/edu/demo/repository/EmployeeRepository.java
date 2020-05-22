package com.go2it.edu.demo.repository;

import com.go2it.edu.demo.entity.Employee;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class EmployeeRepository implements IEmployeeRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public Employee findById(int id) {
        Employee empl = null;
        empl = em.find(Employee.class, id);
        return empl;
    }

    @Override
    public void save(Employee employee) {
        if (employee.getEmployee_id() == 0) {
            em.persist(employee);
        } else {
            em.merge(employee);
        }
    }
}

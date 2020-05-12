package com.go2it.edu.demo.repository;

import com.go2it.edu.demo.entity.Department;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class DepartmentRepository implements IDepartmentRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public Department findById(int id) {
        Department department = null;
        department = em.find(Department.class, id);
        return department;
    }

    @Override
    public void save(Department department) {
        em.persist(department);
    }
}

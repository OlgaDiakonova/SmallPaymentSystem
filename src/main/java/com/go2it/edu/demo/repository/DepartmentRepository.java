package com.go2it.edu.demo.repository;

import com.go2it.edu.demo.entity.Department;
import com.go2it.edu.demo.entity.dto.Result;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
@Transactional
public class DepartmentRepository implements IDepartmentRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public Department findById(int id) {
        //Department department = null;
        return em.find(Department.class, id);

    }

    @Override
    public void save(Department department) {
        if (department.getDepartment_id() == 0) {
            em.persist(department);
        } else {
            em.merge(department);
        }
    }

    @Override
    public List<Result> getEmployeeReport() {
        String txt = "SELECT new com.go2it.edu.demo.entity.dto.Result (e.department.department_name, e.first_name, e.salary )";
        txt += "FROM Employee e ORDER BY e.department.department_name";
        TypedQuery<Result> query = em.createQuery(txt, Result.class);
        return query.getResultList();
    }
}

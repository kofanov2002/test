package com.kofanov.test.domain.repo;

import com.kofanov.test.domain.entity.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
public interface StudentRepo extends CrudRepository<Student, Long>{
    List<Student> findByGroupp(int groupp);
}

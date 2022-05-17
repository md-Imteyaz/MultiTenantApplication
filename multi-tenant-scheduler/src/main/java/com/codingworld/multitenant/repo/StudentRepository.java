package com.codingworld.multitenant.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.codingworld.multitenant.bean.Student;

@EnableJpaRepositories
public interface StudentRepository extends JpaRepository<Student,Long> {

	Student   findByName(String name);

    void deleteByName(String name);


}

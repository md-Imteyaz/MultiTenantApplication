package com.multitenant.service;

import com.multitenant.bean.Student;
import com.multitenant.repo.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentService {

    @Autowired
    private StudentRepository StudentRepository;

    public void save(Student student) {
       StudentRepository.save(student);
   }
    
	
   public List<Student> getAll() throws SQLException {
        return StudentRepository.findAll();

    }

   public Student get(Long id) {
	return StudentRepository.findById(id).get();
   
      }

   
    public Student getByName(String name) {
        return StudentRepository.findByName(name);
    }

    public void delete(String name) {
        StudentRepository.deleteByName(name);
    }
    

}

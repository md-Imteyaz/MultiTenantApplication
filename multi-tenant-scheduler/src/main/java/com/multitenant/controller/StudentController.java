package com.multitenant.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.multitenant.bean.Student;
import com.multitenant.service.StudentService;

@RestController

public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/createStudent")
    public ResponseEntity<?> save(@RequestBody Student student) {
    	studentService.save(student);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/getStudent/all")
    public ResponseEntity<List<Student>> getAll() throws SQLException {
        List<Student> student = studentService.getAll();
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    
    @GetMapping("/getStudent/{id}")
    public ResponseEntity<Student> get(@PathVariable(value = "id") Long id) {
    	Student student = studentService.get(id);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

   
    @GetMapping("/getStudentByName/{name}")
    public ResponseEntity<Student> get(@PathVariable(value = "name") String name) {
    	Student  student= studentService.getByName(name);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    
    @DeleteMapping("/deletebyname/{name}")
    public ResponseEntity<Student> delete(@PathVariable(value = "name") String name) {
    	studentService.delete(name);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
   
   }

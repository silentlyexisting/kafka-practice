package com.practice.controller;

import com.practice.exception.CustomNotFoundException;
import com.practice.model.Student;
import com.practice.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/students")
public class StudentController {

    @Autowired
    private StudentRepository repository;

    @GetMapping
    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable(name = "id") Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new CustomNotFoundException(id));
    }

    @DeleteMapping("/{id}")
    public String deleteStudentById(@PathVariable(name = "id") Long id) {
        repository.deleteById(id);
        return "Student has been deleted successfully";
    }

}

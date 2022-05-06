package com.practice.service;

import com.practice.dto.StudentDto;
import com.practice.model.Student;

public interface StudentService {

    Student createNewStudent(StudentDto studentDto);
}

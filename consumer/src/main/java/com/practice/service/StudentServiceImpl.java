package com.practice.service;

import com.practice.dto.StudentDto;
import com.practice.model.Student;
import com.practice.model.University;
import com.practice.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository repository;

    @Override
    public Student createNewStudent(StudentDto studentDto) {
        return repository.save(new Student(
                studentDto.getFirstName(),
                studentDto.getLastName(),
                studentDto.getCity(),
                consumeUniversity(studentDto)
        ));
    }

    private University consumeUniversity(StudentDto student) {
        return new University(
                student.getUniversity().getName(),
                student.getUniversity().getGrade(),
                student.getUniversity().getAttendance(),
                student.getUniversity().getSubjects()
                );
    }
}

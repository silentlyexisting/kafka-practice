package com.practice.service;

import com.practice.dto.StudentDto;
import com.practice.model.Student;
import com.practice.model.College;
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
                toCollege(studentDto)
        ));
    }

    private College toCollege(StudentDto student) {
        return new College(
                student.getCollege().getName(),
                student.getCollege().getGrade(),
                student.getCollege().getAttendance(),
                student.getCollege().getSubjects()
                );
    }
}

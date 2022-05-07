package com.practice.controller;

import com.practice.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/students")
public class SenderController {

    @Autowired
    private KafkaTemplate<String, Student> kafkaTemplate;

    @PostMapping
    public void produceStudent(@RequestBody Student student) {
        kafkaTemplate.send("kafka-practice", new Student(
                student.firstName(),
                student.lastName(),
                student.city(),
                student.college()
        ));
    }
}

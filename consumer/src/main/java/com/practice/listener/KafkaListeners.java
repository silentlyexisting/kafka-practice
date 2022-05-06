package com.practice.listener;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.practice.dto.StudentDto;
import com.practice.service.StudentService;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @Autowired
    private StudentService studentService;

    @Autowired
    private ObjectMapper objectMapper;


    @KafkaListener(topics = "kafka-practice", groupId = "group_students")
    void consumedJson(ConsumerRecord<String, String> record) throws JsonProcessingException {
        StudentDto student = objectMapper.readValue(record.value(), StudentDto.class);
        studentService.createNewStudent(student);
    }
}

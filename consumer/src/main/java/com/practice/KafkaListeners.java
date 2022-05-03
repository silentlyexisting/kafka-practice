package com.practice;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "kafka-practice", groupId = "group_id"
    )
      void listener(String message) {
        System.out.println("Received message: " + message);
    }
}

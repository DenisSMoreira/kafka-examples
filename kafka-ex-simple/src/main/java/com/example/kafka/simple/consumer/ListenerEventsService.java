package com.example.kafka.simple.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ListenerEventsService {

    @KafkaListener(topics = "${kafka.topic.name}" , groupId = "${kafka.topic.groupId}")
    public void listen(final String message) {
        System.out.println("Received message in group foo: " + message);
    }

}

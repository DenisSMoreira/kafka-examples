package com.example.kafka.simple.controller;

import com.example.kafka.simple.publisher.PublisherEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class KafkaController {

    @Autowired
    private PublisherEventService publisherEventService;

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(path = "/kafka/send" , method =  RequestMethod.GET)
    public void send(@RequestParam("message") String message) {
        publisherEventService.sendMessage(message);
    }
}

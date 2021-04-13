package com.example.kafka.SpringBootKafkaProducer.resource;

import com.example.kafka.SpringBootKafkaProducer.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kafka")
public class UserResource {
    @Autowired
    KafkaTemplate<String, User> kafkaTemplate;

    private static final String TOPIC = "Kafka_learning";

    @RequestMapping("/publish/{name}")
    public String post(@PathVariable("name") final String name){

        kafkaTemplate.send(TOPIC,new User (name,"Technology",1200L));
        return "Publish Successfully";
    }
}

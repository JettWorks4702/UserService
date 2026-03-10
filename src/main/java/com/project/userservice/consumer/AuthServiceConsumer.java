package com.project.userservice.consumer;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.project.userservice.entities.UserInfoDTO;
import com.project.userservice.repository.UserRepository;
import com.project.userservice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceConsumer
{

   private UserRepository userRepository;

   @Autowired
   AuthServiceConsumer(UserRepository userRepository){
       this.userRepository = userRepository;
   }

    @KafkaListener(topics = "${spring.kafka.topic-json.name}", groupId = "${spring.kafka.consumer.group-id}")
    public void listen(UserInfoDTO eventData) {
        try{

        }catch(Exception ex){
            ex.printStackTrace();
            System.out.println("AuthServiceConsumer: Exception is thrown while consuming kafka event");
        }
    }

}
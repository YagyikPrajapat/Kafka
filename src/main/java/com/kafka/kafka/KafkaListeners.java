package com.kafka.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

   @KafkaListener(
           topics = "first_topic",
           groupId = "id1"
   )
   void listeners(String data){
      System.out.println("Listener Received: " + data + "." );
   }
}

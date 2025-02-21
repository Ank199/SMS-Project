package com.api.consumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.api.consumer.model.SendMsg;
import com.api.consumer.repository.SendMsgRepository;



@Service
public class KafkaConsumerService {
    @Autowired
    private SendMsgRepository sendMsgRepository;

    @KafkaListener(topics = "sms_topic", groupId = "sms_group")
    public void consume(String messageId) {
        Long id = Long.parseLong(messageId);
        SendMsg msg = sendMsgRepository.findById(id).orElseThrow();
        
        msg.setStatus("INPROCESS");
        sendMsgRepository.save(msg);
    }
}


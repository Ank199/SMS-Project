package com.api.customer.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.customer.model.SendMsg;
import com.api.customer.repository.SendMsgRepository;

import java.sql.Timestamp;
import java.util.List;

@Service
public class SendMsgService {
    @Autowired
    private SendMsgRepository sendMsgRepository;

    public SendMsg saveMessage(SendMsg msg) {
        msg.setReceivedTs(new Timestamp(System.currentTimeMillis()));
        msg.setStatus("NEW");
        return sendMsgRepository.save(msg);
    }
    
    public List<SendMsg> getNewMessages() {
        return sendMsgRepository.findByStatus("NEW");
    }
}

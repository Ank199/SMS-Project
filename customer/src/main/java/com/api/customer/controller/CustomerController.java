package com.api.customer.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

import com.api.customer.model.SendMsg;
import com.api.customer.model.Users;
import com.api.customer.service.SendMsgService;
import com.api.customer.service.UserService;

import java.util.Optional;


@RestController
@RequestMapping("/telco")
public class CustomerController {
    @Autowired
    private UserService userService;
    
    @Autowired
    private SendMsgService sendMsgService;
    
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @GetMapping("/sendmsg")
    public ResponseEntity<String> sendMessage(
            @RequestParam String username,
            @RequestParam String password,
            @RequestParam String mobile,
            @RequestParam String message) {

        Optional<Users> user = userService.validateUser(username, password);
        if (user.isEmpty() || mobile.length() != 10 || message.isEmpty()) {
            return ResponseEntity.badRequest().body("STATUS: REJECTED");
        }

        SendMsg msg = new SendMsg();
        msg.setMobile(mobile);
        msg.setMessage(message);
        msg.setAccountId(user.get().getAccountId());

        SendMsg savedMsg = sendMsgService.saveMessage(msg);
        kafkaTemplate.send("sms_topic", savedMsg.getId().toString());

        return ResponseEntity.ok("STATUS: ACCEPTED~~ID:" + savedMsg.getId());
    }
}


package com.api.customer.model;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "send_msg")
public class SendMsg {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String mobile;
    private String message;
    private String status;
    private Timestamp receivedTs;
    private Long accountId;
    private String telcoResponse;
    private Timestamp sentTs;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getMobile() {
        return mobile;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public Timestamp getReceivedTs() {
        return receivedTs;
    }
    public void setReceivedTs(Timestamp receivedTs) {
        this.receivedTs = receivedTs;
    }
    public Long getAccountId() {
        return accountId;
    }
    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }
    public String getTelcoResponse() {
        return telcoResponse;
    }
    public void setTelcoResponse(String telcoResponse) {
        this.telcoResponse = telcoResponse;
    }
    public Timestamp getSentTs() {
        return sentTs;
    }
    public void setSentTs(Timestamp sentTs) {
        this.sentTs = sentTs;
    }
    public SendMsg() {
    }
    
}


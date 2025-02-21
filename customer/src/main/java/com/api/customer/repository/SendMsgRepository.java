package com.api.customer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.customer.model.SendMsg;

@Repository
public interface SendMsgRepository extends JpaRepository<SendMsg, Long> {
    List<SendMsg> findByStatus(String status);
}

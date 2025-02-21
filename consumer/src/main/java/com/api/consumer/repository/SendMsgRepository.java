package com.api.consumer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.consumer.model.SendMsg;

@Repository
public interface SendMsgRepository extends JpaRepository<SendMsg, Long> {
}


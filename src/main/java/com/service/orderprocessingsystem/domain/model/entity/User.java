package com.service.orderprocessingsystem.domain.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.sql.Timestamp;
import org.springframework.data.annotation.Id;

@Entity
public record User(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long UserId,
    String username,
    String phone,
    String email,
    String password,
    @Column(name = "created_at")
    Timestamp createdAt,
    @Column(name = "updated_at")
    Timestamp updatedAt
) {

}

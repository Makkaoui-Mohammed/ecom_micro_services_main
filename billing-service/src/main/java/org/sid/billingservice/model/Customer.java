package org.sid.billingservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
public class Customer {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    private String name;
    private String email;

}

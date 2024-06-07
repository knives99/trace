package com.mediaflowtrace.demo.authmenegement.dto;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class ClientDTO {

    String id ;
    String company_id;
    String name;
    String email;
    long phone;
    String created_by;
    Timestamp created_at;
    String updated_by;
    Timestamp updated_at;
    
}

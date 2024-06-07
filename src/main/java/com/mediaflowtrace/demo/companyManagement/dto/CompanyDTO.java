
package com.mediaflowtrace.demo.companyManagement.dto;

import java.sql.Timestamp;

import lombok.Data;




@Data
public class CompanyDTO {



    long id ;

    String name;

    String created_by;

    Timestamp created_at;

    String updated_by;
    Timestamp updated_at;


    
}
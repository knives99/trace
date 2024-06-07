package com.mediaflowtrace.demo.companyManagement.dao;

import java.sql.Timestamp;

import org.springframework.stereotype.Component;

import com.mediaflowtrace.demo.companyManagement.dto.CompanyDTO;


@Component
public class CompanyDao {
    

    public CompanyDTO geCompanyDTO(long id){

        CompanyDTO companyDTO = new CompanyDTO();
        Long datetime = System.currentTimeMillis();
        Timestamp timestamp = new Timestamp(datetime);
        
        int idInt = (int)id;
        switch (idInt) {
            case 1:
                companyDTO.setId((long)1);
                companyDTO.setName("Acompany");   
                companyDTO.setCreated_by("Auther1");
                companyDTO.setUpdated_by("Auther1");
                companyDTO.setCreated_at(timestamp);

                return companyDTO;
            case 2:
                companyDTO.setId((long)2);
                companyDTO.setName("Bcompany");   
                companyDTO.setCreated_by("Auther2");
                companyDTO.setUpdated_by("Auther2");

                return companyDTO;
            
            case 3:
                companyDTO.setId((long)3);
                companyDTO.setName("Ccompany");   
                companyDTO.setCreated_by("Auther3");
                companyDTO.setUpdated_by("Auther3");

                return companyDTO;
            
                
        
            default:
                throw new RuntimeException("invalid id");
        }

    }
}

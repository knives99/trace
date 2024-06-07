package com.mediaflowtrace.demo.companyManagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mediaflowtrace.demo.companyManagement.dao.CompanyDao;
import com.mediaflowtrace.demo.companyManagement.dto.CompanyDTO;

@Service
public class CompanyService {

    @Autowired
    CompanyDao companyDao;

    public CompanyDTO getCompany(long id){

        return companyDao.geCompanyDTO(id);
    }
    
}

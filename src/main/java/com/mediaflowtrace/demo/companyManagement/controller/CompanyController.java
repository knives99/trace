package com.mediaflowtrace.demo.companyManagement.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mediaflowtrace.demo.companyManagement.dto.CompanyDTO;
import com.mediaflowtrace.demo.companyManagement.service.CompanyService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class CompanyController {


    @Autowired
    CompanyService companyService;

    @GetMapping("/hello")
    public String hello() {

        return "Hello";
    }

    @GetMapping("/get/company")
    public CompanyDTO getCompanyDTO(@RequestParam(value = "id") long id) {

        UserDetails userDetails = (UserDetails)SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        Collection<? extends GrantedAuthority>  authorities= userDetails.getAuthorities();
        log.info("Authorities: {}", authorities);

       Boolean superUserFlag = authorities.stream().anyMatch(dto -> dto.getAuthority().contains("superUser"));

        if (superUserFlag) {
            return companyService.getCompany(id);
        }else{
            return null;
        }

        
    }

    @PostMapping("/update/company")
    public CompanyDTO updateCompanyDTO(@RequestParam String param) {

        return null;
    }


    
}

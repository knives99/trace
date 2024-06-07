package com.mediaflowtrace.demo.authmenegement.dto;

import java.util.ArrayList;
import java.util.List;

import com.mediaflowtrace.demo.authmenegement.config.MemberAuthority;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Member {

    String id;
    String userName;
    String password;
    List<MemberAuthority> authorities = new ArrayList<>();
    
    
}


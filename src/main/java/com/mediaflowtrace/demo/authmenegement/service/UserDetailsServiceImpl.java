package com.mediaflowtrace.demo.authmenegement.service;

import java.util.List;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.mediaflowtrace.demo.authmenegement.config.MemberAuthority;
import com.mediaflowtrace.demo.authmenegement.dto.Member;

public class UserDetailsServiceImpl implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Member member = Member.builder().authorities(List.of(MemberAuthority.manager)).build();

        List<SimpleGrantedAuthority> authorities =  member.getAuthorities().stream()
                                                                .map(auth -> new SimpleGrantedAuthority(auth.name()))
                                                                .toList();
        return User.builder().username(username)
                            .password(member.getPassword())
                            .authorities(authorities)
                            .build();




    }

    
}

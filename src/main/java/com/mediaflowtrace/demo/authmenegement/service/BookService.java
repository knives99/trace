package com.mediaflowtrace.demo.authmenegement.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mediaflowtrace.demo.authmenegement.dto.BookDTO;

@Service
public class BookService {


    
    @Autowired
    ArrayList<BookDTO> books;




    public List<BookDTO> getBooks(){


        Collections.sort((List<BookDTO>) books);

        return books;
    }

    public void postBooks(){

        BookDTO book =  BookDTO.builder().id("888")
        .name("TEST")
        .publishDate("2024-04-23")
        .build();

        books.add(book);


    }
    
}

package com.mediaflowtrace.demo.authmenegement.config;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mediaflowtrace.demo.authmenegement.dto.BookDTO;

@Configuration
public class BooksConfig {




    @Bean
    public ArrayList<BookDTO>  books(){
        ArrayList<BookDTO> list = new ArrayList<>();
        
        BookDTO book1 = BookDTO.builder().id("00A3").name("黑心建商的告白").publishDate("2022-10-31").build();
         
        BookDTO book2 = BookDTO.builder().id("FBA9").name("Java 編程入門").publishDate("2022-10-31").build();
         
        BookDTO book3 = BookDTO.builder().id("9786132156437").name("Head First Java, 3/e").publishDate("2022-10-31").build();

        list.add(book1);
        list.add(book2);
        list.add(book3);

        return list;

    }
    
}

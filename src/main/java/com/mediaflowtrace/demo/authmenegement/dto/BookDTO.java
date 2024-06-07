package com.mediaflowtrace.demo.authmenegement.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BookDTO implements Comparable {

    String id;

    String name;

    String publishDate;

    @Override
    public int compareTo(Object o) {
       return this.getId().compareTo(((BookDTO) o).getId());
    }

    
}

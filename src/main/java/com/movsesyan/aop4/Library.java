package com.movsesyan.aop4;

import org.springframework.stereotype.Component;

@Component("libraryBean")
public class Library {
    public void getBook(){
        System.out.println("We take a book");
    }
}

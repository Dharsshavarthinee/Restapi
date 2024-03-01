package com.example.day2.cw4;


import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BookController {
    @GetMapping("/book")
    public Book getBookDetails()
    {
        Date dt=new Date();
        //fetching current date
        Book b=new Book("The Great Soldier","G. Gyan",dt);
        return b;
    }
}

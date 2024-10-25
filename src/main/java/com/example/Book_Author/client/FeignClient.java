package com.example.Book_Author.client;

import com.example.Book_Author.Entity.Author;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public @interface FeignClient {
    String name();

    String url();

    @FeignClient(name = "Book_services", url = "http://localhost:8081/books")
    interface BookFeignClient {

        @GetMapping("/books/author/{authorId}")
        List<Author> getBooksByAuthor(@PathVariable String authorId);
    }
}

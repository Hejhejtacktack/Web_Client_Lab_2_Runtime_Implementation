package com.example.web_client_lab_2_runtime_implementation.service;

import com.example.web_client_lab_2_runtime_implementation.model.Article;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.service.annotation.DeleteExchange;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.PostExchange;
import org.springframework.web.service.annotation.PutExchange;

import java.util.List;

public interface ArticleClient {

    @GetExchange("/books")
    List<Article> getAllBooks();

    @GetExchange("/books/{id}")
    Article getBook(@PathVariable Long id);

    @PostExchange("/books/new")
    Article createBook(@RequestBody Article article);

    @PutExchange("/books/{id}")
    Article updateBook(@RequestBody Article article,
                       @PathVariable Long id);

    @DeleteExchange("/books/{id}")
    Article deleteBook(@PathVariable Long id);
}

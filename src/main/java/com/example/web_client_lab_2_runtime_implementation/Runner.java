package com.example.web_client_lab_2_runtime_implementation;

import com.example.web_client_lab_2_runtime_implementation.model.Article;
import com.example.web_client_lab_2_runtime_implementation.service.ArticleClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Runner implements CommandLineRunner {

    private final ArticleClient articleClient;

    @Autowired
    public Runner(ArticleClient articleClient) {
        this.articleClient = articleClient;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("--------------------------------");
        System.out.println(this.articleClient.getAllBooks());
        System.out.println("--------------------------------");
        System.out.println(this.articleClient.getBook(1L));
        System.out.println("--------------------------------");
        System.out.println(this.articleClient.createBook(new Article(
                "Who dis?",
                "The beginning...",
                1900)));
        System.out.println("--------------------------------");
        System.out.println(this.articleClient.updateBook(new Article(
                "Newest book",
                "Once there wasn't...",
                1876),
                2L));
        System.out.println("--------------------------------");
        System.out.println(this.articleClient.deleteBook(3L));
    }
}

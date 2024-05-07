package com.example.web_client_lab_2_runtime_implementation.model;

public class Article{
    public String title;
    public String content;
    public int publishYear;

    public Article(String title, String content, int publishYear) {
        this.title = title;
        this.content = content;
        this.publishYear = publishYear;
    }

    @Override
    public String toString() {
        return "Article{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", publishYear=" + publishYear +
                '}';
    }
}

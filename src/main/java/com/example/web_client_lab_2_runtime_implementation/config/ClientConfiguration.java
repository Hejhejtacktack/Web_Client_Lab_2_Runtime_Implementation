package com.example.web_client_lab_2_runtime_implementation.config;

import com.example.web_client_lab_2_runtime_implementation.service.ArticleClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

import java.net.http.HttpClient;

@Configuration
public class ClientConfiguration {

    final static String BASE_URL = "http://localhost:8080/api";

    @Bean
    ArticleClient articleClient() {
        WebClient client = WebClient
                .builder()
                .baseUrl(BASE_URL)
                .build();
        WebClientAdapter adapter = WebClientAdapter
                .create(client);
        HttpServiceProxyFactory factory = HttpServiceProxyFactory
                .builderFor(adapter)
                .build();
        return factory.createClient(ArticleClient.class);
    }
}

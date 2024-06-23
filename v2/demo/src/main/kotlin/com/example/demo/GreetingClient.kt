
package com.example.demo
import reactor.core.publisher.Mono
import org.springframework.http.MediaType
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.client.WebClient

@Compponent
public class GreetingClient {

    private final WebClient webClient;

    public GreetingClient(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("http://localhost:8080").build();
    }

    public String getMessage() {
        return this.webClient.get().uri("/hello").accept(MediaType.APPLICATION_JSON)
            .retrieve()
            .bodyToMono(Greeting.class)
            .map(Greeting::getMessage)
    }
}
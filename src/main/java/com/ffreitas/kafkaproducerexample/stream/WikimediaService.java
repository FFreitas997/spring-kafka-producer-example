package com.ffreitas.kafkaproducerexample.stream;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
@RequiredArgsConstructor
public class WikimediaService {

    private final WebClient webClient;
    private final WikimediaConsumer consumer;


    public void wikimediaStreamConsumer() {
        webClient.get()
                .uri("/stream/recentchange")
                .retrieve()
                .bodyToFlux(String.class)
                .subscribe(consumer);
    }
}

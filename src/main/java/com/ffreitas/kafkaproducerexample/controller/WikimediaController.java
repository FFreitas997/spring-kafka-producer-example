package com.ffreitas.kafkaproducerexample.controller;

import com.ffreitas.kafkaproducerexample.stream.WikimediaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/wikimedia")
public class WikimediaController {

    private final WikimediaService wikimediaService;

    @GetMapping
    public ResponseEntity<String> startWikimediaStream() {
        wikimediaService.wikimediaStreamConsumer();
        return ResponseEntity.ok("Wikimedia Stream Started ...");
    }
}

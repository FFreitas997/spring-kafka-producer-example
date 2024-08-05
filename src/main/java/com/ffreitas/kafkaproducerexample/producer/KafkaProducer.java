package com.ffreitas.kafkaproducerexample.producer;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class KafkaProducer {

    private final KafkaTemplate<String, String> template;
    private static final String TOPIC = "wikimedia-stream";

    public void sendMessage(String message) {
        log.info("==== Sending Message to the Topic {} ====\t{}", TOPIC, message);
        template.send(TOPIC, message);
    }
}

package com.ffreitas.kafkaproducerexample.stream;

import com.ffreitas.kafkaproducerexample.producer.KafkaProducer;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

@Slf4j
@Component
@RequiredArgsConstructor
public class WikimediaConsumer implements Consumer<String> {

    private final KafkaProducer kafkaProducer;

    @Override
    public void accept(String s) {
        System.out.println("==== Receiving from Wikimedia Stream Message ====\t" + s);
        kafkaProducer.sendMessage(s);
    }
}

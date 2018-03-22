package com.wilderpereira.producerservice.service;

import com.wilderpereira.producerservice.ProducerChannels;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {

    private final MessageChannel consumerChannel;

    public ProducerService(ProducerChannels consumerChannel) {
        this.consumerChannel = consumerChannel.consumer();
    }


    public void publish(String message) {
        Message<String> msg = MessageBuilder.withPayload(message).build();
        this.consumerChannel.send(msg);
    }
}

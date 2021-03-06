package com.wilderpereira.producerservice;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Component;

@Component
public interface ProducerChannels {
    @Output
    MessageChannel consumer();
}

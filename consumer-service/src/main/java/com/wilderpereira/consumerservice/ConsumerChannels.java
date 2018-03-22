package com.wilderpereira.consumerservice;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface ConsumerChannels {

    String INPUT = "producer";

    @Input
    SubscribableChannel producer();
}

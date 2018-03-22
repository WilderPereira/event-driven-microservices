package com.wilderpereira.producerservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.MessageChannel;


@SpringBootApplication
@EnableBinding(ProducerChannels.class)
public class ProducerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProducerServiceApplication.class, args);
	}
}


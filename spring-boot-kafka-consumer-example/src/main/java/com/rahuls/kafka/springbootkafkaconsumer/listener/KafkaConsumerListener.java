package com.rahuls.kafka.springbootkafkaconsumer.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.rahuls.kafka.springbootkafkaconsumer.model.User;

@Service
public class KafkaConsumerListener {

	@KafkaListener(topics = "rahuls_kafka_example", group = "group_string")
	public void consume(String message) {
		System.out.println("Consumed String message: " + message);
	}


	@KafkaListener(topics = "rahuls_kafka_example_json", group = "group_json",
			containerFactory = "userKafkaListenerFactory")
	public void consumeJson(User user) {
		System.out.println("Consumed JSON Message: " + user);
	}
}

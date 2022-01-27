package learn.kafka.consumer.basic.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ConsumerService {

	private static final String TOPIC = "message-topic";
	private static final String GROUP = "message-group";

	@KafkaListener(topics = TOPIC, groupId = GROUP)
	public void consume(String userDetails) {
		log.info("Consuming Request on Topic :: " + TOPIC + " for user :: " + userDetails);
		System.out.println("Consuming Request on Topic :: " + TOPIC + " for user :: " + userDetails);
	}
}

package com.user.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConfig {
	@KafkaListener(topics =AppConstant.LOCATION_UPDATE,groupId = AppConstant.GROUP_ID)
	public void updatedLocation(String value) {
		System.out.println(value);
	}
}

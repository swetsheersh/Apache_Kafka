package com.deliveryboy.service;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.deliveryboy.config.AppConstants;
import org.slf4j.Logger;



@Service
public class KafakaService {
	//Logging whether message is producing or not
	private Logger logger=LoggerFactory.getLogger(KafakaService.class);
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	public boolean updateLocation(String location) {
		this.kafkaTemplate.send(AppConstants.Location_Topic_Name,location);
		this.logger.info("Location Updated");
		return true;
	}
}

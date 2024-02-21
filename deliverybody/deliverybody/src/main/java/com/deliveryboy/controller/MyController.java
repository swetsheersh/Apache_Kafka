package com.deliveryboy.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deliveryboy.service.KafakaService;

@RestController
@RequestMapping(path = "contact")
public class MyController {
	@GetMapping(path = "/test")
	public String test() {
		return "I am Delivery Boy";
	}
	@Autowired
	private KafakaService kf;
	@GetMapping(path = "/update")
	public ResponseEntity<?> locationUpdate(){
		this.kf.updateLocation("( "+Math.round(Math.random()*100)+" , "+Math.round(Math.random()*100)+" )");
		return new ResponseEntity<>(Map.of("message","Location Updated"),HttpStatus.OK);
	}
}

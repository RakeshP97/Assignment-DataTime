package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.data.Application;
import com.example.demo.service.DateTimeService;

@RestController
@RequestMapping("/app")
public class DateTimeController {
	
	private final Logger log = LoggerFactory.getLogger(getClass());

	@Autowired
	DateTimeService service;
	
	@RequestMapping(value="", method=RequestMethod.POST)
	public Application addDataTime() {
		log.info("Processing request in controller");
		return	service.persistDataTime();
	}
	
	

}

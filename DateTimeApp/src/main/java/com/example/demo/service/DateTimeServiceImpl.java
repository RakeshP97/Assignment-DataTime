package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.DateTimeDao;
import com.example.demo.data.Application;

@Service
public class DateTimeServiceImpl implements DateTimeService {
	
	@Autowired
	DateTimeDao daoIml;

	@Override
	public Application persistDataTime() {
		// TODO Auto-generated method stub
		return daoIml.persistDataTime();
		
	}

}

package com.example.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.data.Application;

@Repository
public class DateTimeDaoImpl implements DateTimeDao{
	
	@Autowired
	private MongoTemplate mongoTemplate;
	
	@Override
	public Application persistDataTime() {
		// TODO Auto-generated method stub
		Application app = new Application();
		app.setAppId(app.getCreationDate().toString());
		mongoTemplate.save(app);
		return app;
	}


}

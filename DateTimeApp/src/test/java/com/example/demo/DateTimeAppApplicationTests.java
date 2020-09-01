package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DBObject;

@SpringBootTest
class DateTimeAppApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void test(@Autowired MongoTemplate mongoTemplate) {
		DBObject objectToSave = BasicDBObjectBuilder.start().add("key", "value").get();

		mongoTemplate.save(objectToSave, "collection");

		assertThat(mongoTemplate.findAll(DBObject.class, "collection")).extracting("key").containsOnly("value");
	}
}

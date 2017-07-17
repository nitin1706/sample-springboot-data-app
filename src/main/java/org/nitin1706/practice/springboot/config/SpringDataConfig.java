package org.nitin1706.practice.springboot.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;

@Configuration
@EnableAutoConfiguration
public class SpringDataConfig extends AbstractMongoConfiguration {

	@Override
	public String getDatabaseName() {
		return "practice_product_db";
	}

	@Override
	@Bean
	public Mongo mongo() throws Exception {
		return new MongoClient("localhost");
	}
}
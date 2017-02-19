package com.udr013.discogs_rest_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@EnableCaching
@PropertySource("classpath:application.properties")
public class RecordDbRestServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecordDbRestServerApplication.class, args);
	}
}

package com.udr013.discogs_rest_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Arrays;

@SpringBootApplication
@PropertySource("classpath:application.properties")
@EnableSwagger2
public class RecordDbRestServerApplication {

	public static void main(String[] args) {

		final SpringApplication application = new SpringApplication(RecordDbRestServerApplication.class);

		application.setLogStartupInfo(true);
//		application.setShowBanner(false);
		application.run();
		ApplicationContext context = application.run(args);

		final String[] beanDefinitionNames = context.getBeanDefinitionNames();
		Arrays.stream(beanDefinitionNames).forEach(System.out::println);

	}
}

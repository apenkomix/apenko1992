package org.example.javaspring;

import org.example.javaspring.homework_22.property.EmailProperty;
import org.example.javaspring.homework_22.property.EmailPropertyConstructorBinding;
import org.example.javaspring.homework_22.property.EmailPropertyRecord;
import org.example.javaspring.homework_22.property.PingwitEmailPropertyRecord;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({EmailProperty.class , EmailPropertyConstructorBinding.class, EmailPropertyRecord.class, PingwitEmailPropertyRecord.class})
public class JavaSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaSpringApplication.class, args);
	}

}

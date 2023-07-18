package com.example.authjwt;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "Eduction System",
				version = "1.0.0",
				description = "This project is only for testing",
				termsOfService = "codingmaster",
				contact = @Contact(
						name = "Junayd Gul",
						email = "iamjunaydgul@gmail.com"
				),
				license = @License(
						name = "licence",
						url = "codingmaster"
				)
		)
)
public class AuthJWTApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthJWTApplication.class, args);
	}
}

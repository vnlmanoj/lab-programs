package com.capg.demo.productresttemplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ProductRestTemplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductRestTemplateApplication.class, args);
	}
@Bean
public RestTemplate getTemplate()
{
return new RestTemplate();	
}
}

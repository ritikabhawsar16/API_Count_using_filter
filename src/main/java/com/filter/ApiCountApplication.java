package com.filter;

import javax.servlet.Filter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.filter.counterfilter.ApiCounterFilter;
import com.filter.repository.ApiCounterRepository;

@SpringBootApplication
public class ApiCountApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiCountApplication.class, args);
	}

//	 @Bean
//     public FilterRegistrationBean<Filter> apiCounterFilterRegistration(ApiCounterRepository apiCounterRepository) {
//         FilterRegistrationBean<Filter> registration = new FilterRegistrationBean<>();
//         registration.setFilter(new ApiCounterFilter(apiCounterRepository));
//         registration.addUrlPatterns("/your-api-endpoint");
//         return registration;
//     }
}

package com.filter.config;

import javax.servlet.Filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.filter.counterfilter.ApiCounterFilter;
import com.filter.repository.ApiCounterRepository;

@Configuration
public class FilterConfig {
	
	
//	 @Bean
//     public FilterRegistrationBean<ApiCounterFilter> apiCounterFilterRegistration(ApiCounterRepository apiCounterRepository) {
//         FilterRegistrationBean<ApiCounterFilter> registration = new FilterRegistrationBean<>();
//         registration.setFilter(new ApiCounterFilter(apiCounterRepository));
//         registration.addUrlPatterns("/your-api-endpoint");
//         return registration;
//     }
}

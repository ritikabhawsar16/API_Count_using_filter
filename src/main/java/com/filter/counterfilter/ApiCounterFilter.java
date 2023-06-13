package com.filter.counterfilter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.filter.entity.ApiCounterEntity;
import com.filter.repository.ApiCounterRepository;

@Component
public class ApiCounterFilter implements Filter  {
	@Autowired
	private ApiCounterRepository apiCounterRepository;
	
//    public ApiCounterFilter(ApiCounterRepository apiCounterRepository) {
//		
//		this.apiCounterRepository = apiCounterRepository;
//	}
	@Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException
	{
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        //System.out.println("hoiiiioi");
        
        // Check if the request is for the API endpoint you want to count
       
        	ApiCounterEntity counterEntity =  apiCounterRepository.findByApiName(httpRequest.getRequestURI());
        	if(counterEntity!=null) {
	            counterEntity.setCount(counterEntity.getCount() + 1);
        	}else {
        		counterEntity=new ApiCounterEntity();
        		counterEntity.setApiName(httpRequest.getRequestURI());
        		counterEntity.setCount(1);
        	}
        	
        	
        	
            apiCounterRepository.save(counterEntity);
      
        // Continue the filter chain
        chain.doFilter(request, response);
    }
}

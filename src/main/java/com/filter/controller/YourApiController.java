package com.filter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.filter.repository.ApiCounterRepository;

@RestController
@RequestMapping("/your-api-endpoint")
public class YourApiController {


    private final ApiCounterRepository apiCounterRepository;

    @Autowired
    public YourApiController(ApiCounterRepository apiCounterRepository) {
        this.apiCounterRepository = apiCounterRepository;
    }

    @GetMapping("/display")
    public String yourApiEndpoint() {
    	//System.out.println("ooooooooooooooooooooooo");
        return "Display API";
    }

    @GetMapping("/count")
    public int getCount() {
    	
		return 1;
        //return ++count;
    }
}

package com.sunnycorp.orchestrator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.sunnycorp.model.Source;

@RestController
public class MiddleManController {

    @Autowired
    private RestTemplate restTemplate;
    
    @RequestMapping(value = "/httpbin", method = RequestMethod.GET)
    public Source getRemoteData() {
    	return this.restTemplate.getForObject("https://httpbin.org/get", Source.class);
    }

}

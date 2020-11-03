package com.company.demo.actuator.endpoint;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id = "customendpoint")
public class CustomEndpoint {

    @ReadOperation
    public String test(){
        return ":)";
    }

}

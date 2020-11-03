package com.company.demo.controller;

import com.company.demo.util.ResponseHelper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.actuate.health.HealthEndpoint;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@Api(value = "Health Rest")
@RequiredArgsConstructor
public class Controller {

    private final HealthEndpoint healthEndpoint;

    @GetMapping("/get-health")
    @ApiOperation(value = "Health Rest")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "success", response = String.class)})
    public ResponseEntity ping() {

        return ResponseHelper.setResponse(healthEndpoint.health());
    }

}

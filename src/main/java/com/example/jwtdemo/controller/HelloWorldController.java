/*
 * Copyright (c) 2022.
 */

package com.example.jwtdemo.controller;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Vinci
 */
@RestController
@SecurityRequirement(name = "dotuyen-api")
public class HelloWorldController {

    @RequestMapping("/hellouser")
    public String getUser()
    {
        return "Hello User";
    }

    @RequestMapping("/helloadmin")
    public String getAdmin()
    {
        return "Hello Admin";
    }
}

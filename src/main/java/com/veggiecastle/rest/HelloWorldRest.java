/*
 * Copyright (c) 2022.
 */

package com.veggiecastle.rest;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Vinci
 */
@RestController
@SecurityRequirement(name = "dotuyen-api")
public class HelloWorldRest {

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

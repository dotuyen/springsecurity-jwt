package com.example.jwtdemo;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Configure Swagger for Spring Security
 * SecurityScheme: For authentication and authorization schemes, OpenAPI refers to them as security schemes.
 * OpenAPI 3.0 allows you to specify APIs that are secured by the following security schemes.
 *
 * HTTP authentication schemes (they use the Authorization header):
 * Basic
 * Bearer
 * other HTTP schemes as defined by RFC 7235 and HTTP Authentication Scheme Registry
 * API keys in headers, query string or cookies
 * Cookie authentication
 * OAuth 2
 * OpenID Connect Discovery
 */
@SpringBootApplication
@SecurityScheme(name = "dotuyen-api", scheme = "basic", type = SecuritySchemeType.HTTP, in = SecuritySchemeIn.HEADER)
@OpenAPIDefinition(info = @Info(title = "User API", version = "2.0", description = "User Details"))
public class JwtDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(JwtDemoApplication.class, args);
    }
}

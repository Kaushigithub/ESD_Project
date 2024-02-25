package com.academicerp.studentpayment.restservisor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfiguration implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*") // Allow all origins (you can specify specific origins here)
                .allowedMethods("*"); // Allow all HTTP methods (GET, POST, PUT, DELETE, etc.)
    }
}
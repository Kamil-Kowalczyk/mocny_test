package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**") // Apply to all endpoints
                .allowedOrigins("http://localhost:4200") // Allowed domains
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Allowed methods
                .allowedHeaders("*") // Allow all headers
                .allowCredentials(true); // Allow cookies
            }
        };
    }
    // @Override
    // public void addCorsMappings(CorsRegistry registry) {
    //     registry.addMapping("/**") // Apply to all endpoints
    //             .allowedOrigins("http://localhost:4200") // Allowed domains
    //             .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Allowed methods
    //             .allowedHeaders("*") // Allow all headers
    //             .allowCredentials(true); // Allow cookies
    // }
}

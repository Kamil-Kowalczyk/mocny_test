// package com.example.demo.config;

// import org.springframework.context.annotation.Configuration;
// import org.springframework.web.servlet.config.annotation.CorsRegistry;
// import org.springframework.web.servlet.config.annotation.EnableWebMvc;
// import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// @Configuration
// @EnableWebMvc
// public class CorsConfig implements WebMvcConfigurer {

//     @Override
//     public void addCorsMappings(CorsRegistry registry) {
//         registry.addMapping("/**") // Apply to all endpoints
//                 .allowedOrigins("http://localhost:4200") // Allowed domains
//                 .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Allowed methods
//                 .allowedHeaders("*") // Allow all headers
//                 .allowCredentials(true); // Allow cookies
//     }
// }
//TODO nie działa
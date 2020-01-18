package com.roomator;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Indicates that a class declares one or more @Bean methods and may be processed by the Spring container
 * to generate bean definitions and service requests for those beans at runtime, for example:
 * @link{https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/context/annotation/Configuration.html}
 */
@Configuration
public class CORSConfig implements WebMvcConfigurer {

    // Adding Cross-Origin-Resource-Sharing
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // to path /** allow all methods and allow credentials
        registry.addMapping("/**").allowedMethods("*").allowCredentials(true);
    }
}

package org.example.spring_exercises.config;

import org.example.spring_exercises.services.Foo;
import org.example.spring_exercises.FooImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Foo foo() {
        return new FooImpl();
    }
}

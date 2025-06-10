package org.example.spring_exercises;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringExercisesApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringExercisesApplication.class, args);
        Consumer consumer = context.getBean(Consumer.class);
        consumer.use();
    }
}

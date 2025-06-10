package org.example.spring_exercises;

import org.example.spring_exercises.services.Foo;
import org.springframework.stereotype.Component;

@Component
public class FooImpl implements Foo {
    @Override
    public void doSomething() {
        System.out.println("FooImpl is doing something");
    }
}

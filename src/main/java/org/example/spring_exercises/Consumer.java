package org.example.spring_exercises;

import org.example.spring_exercises.services.Foo;
import org.springframework.stereotype.Component;

@Component
public class Consumer {
    private final Foo foo;

    public Consumer(Foo foo) {
        this.foo = foo;
    }

    public void use() {
        foo.doSomething();
    }
}

package org.example;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.boot.context.properties.bind.DefaultValue;

@ConfigurationProperties("outer")
public class Nested {

    private String name;

    private Inner inner;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Inner getInner() {
        return inner;
    }

    public void setInner(Inner inner) {
        this.inner = inner;
    }

    public record Inner(@DefaultValue("10") int size) {

        @ConstructorBinding
        public Inner {
            System.out.println("test");
        }

    }

}

package org.example;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.boot.context.properties.bind.DefaultValue;

@ConfigurationProperties("retry")
public record SimpleRecord(@DefaultValue("6") int maxAttempts) {

    @ConstructorBinding
    public SimpleRecord {
        System.out.println("test");
    }

    public SimpleRecord() {
        this(5);
    }

}

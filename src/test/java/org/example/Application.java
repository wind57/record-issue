package org.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(SimpleRecord.class)
@SpringBootApplication
public class Application {
}

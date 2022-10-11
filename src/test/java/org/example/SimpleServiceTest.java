package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = "retry.max-attempts=1", classes = Application.class)
public class SimpleServiceTest {

    @Autowired
    private SimpleService service;

    @Test
    void testSimpleService() {
        SimpleRecord record = service.simple();
        Assertions.assertNotNull(record);

        Assertions.assertEquals(1, record.maxAttempts());
    }

}

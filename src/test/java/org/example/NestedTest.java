package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = {"outer.name=abc", "outer.inner.size=5"}, classes = Application.class)
public class NestedTest {

    @Autowired
    private NestedService service;

    @Test
    void testNestedService() {
        Nested record = service.nested();
        Assertions.assertNotNull(record);

        Assertions.assertEquals("abc", record.getName());
        Assertions.assertEquals(5, record.getInner().size());
    }

}

package record.binding;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = "spring.cloud.bootstrap.enabled=true", classes = Application.class)
public class SamplePropertiesTest {

    @Test
    public void test() {

    }

}

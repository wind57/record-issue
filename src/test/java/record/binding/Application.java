package record.binding;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(SampleProperties.class)
@SpringBootApplication
public class Application {
}

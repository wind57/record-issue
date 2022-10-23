package record.binding;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

@ConfigurationProperties("org.sample")
public record SampleProperties(List<String> list) {

}

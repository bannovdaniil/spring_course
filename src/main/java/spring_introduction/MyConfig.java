package spring_introduction;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(value = "spring_introduction")
@PropertySource("classpath:app.properties")
public class MyConfig {
}

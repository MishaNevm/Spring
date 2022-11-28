package org.example.pr15;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("org.example.pr15")
@PropertySource("classpath:musicPlayerParametrs.properties")
public class SpringConfig {
}

package org.example.ls10;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("org.example.ls10")
@PropertySource("classpath:MusicPlayer.properties")
public class SpringConfig {
}

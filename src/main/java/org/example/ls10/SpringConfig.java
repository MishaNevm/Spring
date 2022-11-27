package org.example.ls10;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:MusicPlayer.properties")
public class SpringConfig {
    @Bean
    public Music classicMusic() {
        return new ClassicMusic();
    }

    @Bean
    public Music rockMusic() {
        return new RockMusic();
    }

    @Bean
    public Music rapMusic() {
        return new RapMusic();
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(rockMusic(), rapMusic(), classicMusic());
    }
}

package prg.example.pr14;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.List;

@Configuration
@PropertySource("classpath:musicPlayerParametrs.properties")
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
    public List<Music> musicTypesList() {
        return List.of(classicMusic(), rapMusic(), rockMusic());
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(musicTypesList());
    }
}

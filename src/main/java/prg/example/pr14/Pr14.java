package prg.example.pr14;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Pr14 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        context.getBean("musicPlayer",MusicPlayer.class).playRandomPlayList();
        context.close();
    }
}

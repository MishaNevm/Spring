package prg.example.pr14;

import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.Random;

public class MusicPlayer {
    private final List<Music> musicList;
    @Value("${MusicPlayer.name}")
    private String name;
    @Value("${MusicPlayer.volume}")
    private int volume;

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playRandomPlayList() {
        Random random = new Random();
        System.out.println(name);
        System.out.println(volume + "\n");
        for (String song : musicList.get(random.nextInt(musicList.size())).getSongs()) {
            System.out.println(song);
        }
    }
}

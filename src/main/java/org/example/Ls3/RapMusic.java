package org.example.Ls3;

import org.springframework.stereotype.Component;
import javax.annotation.PreDestroy;

@Component
public class RapMusic implements Music{
    @PreDestroy
    public void destroyMethod () {
        System.out.println("rap music destroy");
    }

    @Override
    public String getSong() {
        return "Yoyoyo it's a RAPchik";
    }
}

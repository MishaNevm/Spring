package org.example.Ls3;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class ClassicMusic implements Music{
    @PostConstruct
    public void initMethod () {
        System.out.println("Classical music create");
    }

    @Override
    public String getSong() {
        return "Lalala it's a Bah";
    }
}

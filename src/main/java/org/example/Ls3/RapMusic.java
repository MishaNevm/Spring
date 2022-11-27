package org.example.Ls3;

import org.springframework.stereotype.Component;

@Component
public class RapMusic implements Music{
    @Override
    public String getSong() {
        return "Yoyoyo it's a RAPchik";
    }
}

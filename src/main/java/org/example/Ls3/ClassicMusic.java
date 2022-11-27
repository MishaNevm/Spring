package org.example.Ls3;

import org.springframework.stereotype.Component;

@Component
public class ClassicMusic implements Music{
    @Override
    public String getSong() {
        return "Lalala it's a Bah";
    }
}

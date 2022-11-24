package org.example.Ls3;

import org.springframework.stereotype.Component;

@Component
public class ClassicMusic implements Music{
    @Override
    public String[] getSong() {
        return new String[] {"Classic 1", "Classic 2"};
    }
}

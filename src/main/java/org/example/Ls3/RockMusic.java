package org.example.Ls3;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music{
    @Override
    public String[] getSong() {

        return new String[]{"Rock 1", "Rock 2", "Rock 3"};
    }
}

package org.example.pr11;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music{
    @Override
    public String[] getSong() {
        return new String[]{"rock1","rock2","rock3","rock4"};
    }
}

package org.example.pr11;

import org.springframework.stereotype.Component;

@Component
public class RapMusic implements Music{
    @Override
    public String[] getSong() {
        return new String[]{"rap1","rap2","rap3"};
    }
}

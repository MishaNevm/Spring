package org.example.Ls3;

import org.springframework.stereotype.Component;
@Component
public class RapMusic implements Music{
    @Override
    public String[] getSong()
    {
        return new String[] {"Rap 1", "Rap 2", "Rap 3", "Rap 4"};
    }
}

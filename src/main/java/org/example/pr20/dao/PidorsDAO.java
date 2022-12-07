package org.example.pr20.dao;

import org.example.pr20.models.Pidor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PidorsDAO {
    private static int PIDOR_COUNTER = 0;
    private final List<Pidor> pidorList;

    {
        pidorList = new ArrayList<>();
    }

    public List<Pidor> getPidorList() {
        return pidorList;
    }

    public Pidor getPidor(int id) {
        return pidorList.get(id - 1);
    }

    public void addPidor(Pidor pidor) {
        pidor.setId(++PIDOR_COUNTER);
        pidorList.add(pidor);
    }
}

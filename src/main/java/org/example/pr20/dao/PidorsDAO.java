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
        return pidorList.stream().filter(a -> a.getId() == id).findAny().orElse(null);
    }

    public void addPidor(Pidor pidor) {
        pidor.setId(++PIDOR_COUNTER);
        pidorList.add(pidor);
    }

    public void edit(Pidor pidor) {
        Pidor pidorToEdit = pidorList.stream().filter(a -> a.getId() == pidor.getId()).findAny().orElse(null);
        if (pidorToEdit != null) {
            pidorToEdit.setName(pidor.getName());
            pidorToEdit.setProstupok(pidor.getProstupok());
            pidorToEdit.setProstupokRating(pidor.getProstupokRating());
        }
    }

    public void delete(int id) {
        pidorList.removeIf(a -> a.getId() == id);
    }
}

package org.example.pr19.dao;

import org.example.pr19.models.Client;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClientDAO {

    private final List<Client> clientList;
    {
        int CLIENT_COUNTER = 0;
        clientList = new ArrayList<>(List.of(
                new Client(++CLIENT_COUNTER, "Dom mebeli"),
                new Client(++CLIENT_COUNTER, "IP Loginova"),
                new Client(++CLIENT_COUNTER, "Tatiana")
        ));
    }

    public List <Client> getClientList() {
        return clientList;
    }
    public Client getClient (int id) {
        return clientList.stream().filter(a -> a.getId() == id).findAny().orElse(null);
    }
}

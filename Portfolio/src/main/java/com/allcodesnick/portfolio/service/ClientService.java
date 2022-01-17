package com.allcodesnick.portfolio.service;

import com.allcodesnick.portfolio.model.Client;

import java.util.List;

public interface ClientService {

    Client saveClient(Client client);

    List<Client> listClients();

    Client getClientById(long id);

    void deleteClient(long id);

    Client updateClient(Client client, long id);

}

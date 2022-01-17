package com.allcodesnick.portfolio.service.impl;

import com.allcodesnick.portfolio.exception.ResourceNotFoundException;
import com.allcodesnick.portfolio.model.Client;
import com.allcodesnick.portfolio.repository.ClientRepository;
import com.allcodesnick.portfolio.service.ClientService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientManager implements ClientService {

    private ClientRepository clientRepository;

    public ClientManager(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }


    @Override
    public Client saveClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public List<Client> listClients() {
        return clientRepository.findAll();
    }

    @Override
    public Client getClientById(long id) {
        return clientRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Client","ID", id));
    }

    @Override
    public void deleteClient(long id) {
        Client client = clientRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Client","ID", id));
        clientRepository.delete(client);
    }

    @Override
    public Client updateClient(Client client, long id) {
        Client existingClient = clientRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Client","ID", id));
        existingClient.setFullName(client.getFullName());
        existingClient.setEmail(client.getEmail());
        existingClient.setPhoneNumber(client.getPhoneNumber());
        return clientRepository.save(existingClient);
    }
}


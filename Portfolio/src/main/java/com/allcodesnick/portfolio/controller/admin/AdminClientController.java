package com.allcodesnick.portfolio.controller.admin;

import com.allcodesnick.portfolio.model.Client;
import com.allcodesnick.portfolio.service.ClientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin/client")
public class AdminClientController {

    private ClientService clientService;

    public AdminClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/list-all")
    public List<Client> listClients(){
        return clientService.listClients();
    }

    @DeleteMapping("/delete/{clientId}")
    public void deleteClientInformation(@PathVariable long clientId){
        clientService.deleteClient(clientId);
    }

    @GetMapping("/view/{clientId}")
    public Client getClient(@PathVariable long clientId){
        return clientService.getClientById(clientId);
    }
}

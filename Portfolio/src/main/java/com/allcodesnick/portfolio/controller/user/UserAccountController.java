package com.allcodesnick.portfolio.controller.user;

import com.allcodesnick.portfolio.model.Client;
import com.allcodesnick.portfolio.service.ClientService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user/account")
public class UserAccountController {

    private ClientService clientService;

    public UserAccountController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping("/create")
    public Client saveAccountInformation(@RequestBody Client client){
        return clientService.saveClient(client);
    }

    @PutMapping("/update/{clientId}")
    public Client updateAccountInformation(@RequestBody Client client, @PathVariable long clientId){
        return clientService.updateClient(client, clientId);
    }

}

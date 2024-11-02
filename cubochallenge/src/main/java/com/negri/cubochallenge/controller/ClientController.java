package com.negri.cubochallenge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.negri.cubochallenge.entity.Client;
import com.negri.cubochallenge.entity.dto.ClientDTO;
import com.negri.cubochallenge.service.ClientService;


@RestController
@RequestMapping("/client")

public class ClientController {

    @Autowired
    private ClientService clientService;

    @PostMapping("/save")
    public ResponseEntity<Client> saveClient(@RequestBody ClientDTO clientDTO){
        Client client = clientService.createClient(clientDTO);
        return ResponseEntity.ok().body(client);
    }

    @GetMapping("/listAll")
    public ResponseEntity<List<Client>> listAllClients(){
        List<Client> clientsList = clientService.listAllClients();
        return ResponseEntity.ok().body(clientsList);
    }

}

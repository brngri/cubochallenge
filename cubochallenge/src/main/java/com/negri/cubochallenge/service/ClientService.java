package com.negri.cubochallenge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.negri.cubochallenge.entity.Client;
import com.negri.cubochallenge.entity.dto.ClientDTO;
import com.negri.cubochallenge.repository.Clientrepository;

@Service
public class ClientService {
    
    @Autowired
    private Clientrepository clientrepository;

    public Client createClient(ClientDTO clientDTO){


        if (clientDTO.firstName() == null || clientDTO.lastName() == null || clientDTO.participation() == null) {
            throw new NullPointerException();
        }

        Client client = new Client();

        client.setFirstName(clientDTO.firstName());
        client.setLastName(clientDTO.lastName());
        client.setParticipation(clientDTO.participation());

        return clientrepository.save(client);
    }

    public List<Client> listAllClients(){
        List<Client> allClients = clientrepository.findAll();

        if(allClients == null || allClients.isEmpty()){
            throw new NullPointerException();
        }

        return allClients;
    }
}

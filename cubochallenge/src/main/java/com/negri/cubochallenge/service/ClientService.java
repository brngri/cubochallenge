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
        Client client = new Client();

        client.setFirstName(clientDTO.firstName());
        client.setLastName(clientDTO.lastName());
        client.setParticipation(clientDTO.participation());

        return clientrepository.save(client);
    }

    public List<Client> listAllClients(){
        return clientrepository.findAll();
    }
}

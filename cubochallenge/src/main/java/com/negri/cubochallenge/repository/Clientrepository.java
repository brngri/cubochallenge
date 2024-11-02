package com.negri.cubochallenge.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.negri.cubochallenge.entity.Client;

public interface Clientrepository extends JpaRepository<Client, Long>{
    
}

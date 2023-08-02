package com.garra.crudclient.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.garra.crudclient.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}

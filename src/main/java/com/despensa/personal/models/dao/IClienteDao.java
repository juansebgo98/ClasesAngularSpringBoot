package com.despensa.personal.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.despensa.personal.models.entity.Cliente;

public interface IClienteDao extends JpaRepository<Cliente, Long>{

}

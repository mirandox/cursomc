package com.mirandox.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mirandox.cursomc.domain.Cliente;

@Repository
public interface ClienteRepositoy extends JpaRepository<Cliente, Integer>{

}

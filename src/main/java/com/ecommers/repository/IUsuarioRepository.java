package com.ecommers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommers.model.Usuario;


@Repository
public interface UsuarioRepository extends JpaRepository <Usuario, Integer>{

}

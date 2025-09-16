package com.ecommers.service;

import java.util.Optional;

import com.ecommers.model.Usuario;

public interface IUsuarioService {
    Optional <Usuario> findById(Integer id); 

}

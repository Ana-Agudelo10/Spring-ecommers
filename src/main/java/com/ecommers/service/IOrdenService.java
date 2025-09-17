package com.ecommers.service;

import java.util.List;

import com.ecommers.model.Orden;

public interface IOrdenService {
    List<Orden> findAll();
    Orden save(Orden orden);
    String generarNumeroOrden();
}


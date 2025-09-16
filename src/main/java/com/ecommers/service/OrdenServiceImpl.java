package com.ecommers.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommers.model.Orden;
import com.ecommers.repository.IOrdenRepository;

@Service
public class OrdenServiceImpl implements IOrdenService {


    @Autowired
    private IOrdenRepository ordenRepository;

    @Override
    public Orden save(Orden order) {
        return ordenRepository.save(orden);
        
    }

}

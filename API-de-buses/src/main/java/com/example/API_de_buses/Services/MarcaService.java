package com.example.API_de_buses.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.API_de_buses.Modelo.Marca;
import com.example.API_de_buses.Repository.MarcaRepository;

import java.util.List;
import java.util.Optional;

@Service
public class MarcaService {

    @Autowired
    private MarcaRepository marcaRepository;

    public List<Marca> getAllMarcas() {
        return marcaRepository.findAll();
    }

    public Optional<Marca> getMarcaById(Long id) {
        return marcaRepository.findById(id);
    }

    public Marca saveMarca(Marca marca) {
        return marcaRepository.save(marca);
    }
}

package com.example.API_de_buses.Controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.API_de_buses.Modelo.Marca;
import com.example.API_de_buses.Services.MarcaService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/marca")
public class MarcaController {

    @Autowired
    private MarcaService marcaService;

 // Método para obtener todas las marcas
    @GetMapping
    public List<Marca> getAllMarcas() {
        return marcaService.getAllMarcas();
    }
    // Método para obtener una marca por su ID
    @GetMapping("/{id}")
    public Optional<Marca> getMarcaById(@PathVariable Long id) {
        return marcaService.getMarcaById(id);
    }
    // Método para crear una nueva marca
    @PostMapping
    public Marca createMarca(@RequestBody Marca marca) {
        return marcaService.saveMarca(marca);
    }
}

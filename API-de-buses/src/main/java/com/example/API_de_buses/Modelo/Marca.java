package com.example.API_de_buses.Modelo;

import jakarta.persistence.*;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "marcas")
public class Marca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;
    
    @OneToMany(mappedBy = "marca", cascade = CascadeType.ALL)
    @JsonBackReference // Esta evita serializar la lista de buses al serializar Marca
    private List<Bus> buses;
    
    // Constructor vacío para JPA
    public Marca() {}

    // Constructor con parámetros
    public Marca(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Bus> getBuses() {
        return buses;
    }

    public void setBuses(List<Bus> buses) {
        this.buses = buses;
    }
    
 // Método toString()
    @Override
    public String toString() {
        return "Marca{id=" + id + ", nombre='" + nombre + "'}";
    }
}

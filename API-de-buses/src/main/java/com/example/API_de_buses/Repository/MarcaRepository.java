package com.example.API_de_buses.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.API_de_buses.Modelo.Marca;

public interface MarcaRepository extends JpaRepository<Marca, Long> {
}

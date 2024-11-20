package com.example.API_de_buses.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.API_de_buses.Modelo.Bus;

import java.util.List;

public interface BusRepository extends JpaRepository<Bus, Long> {
    List<Bus> findByActivo(Boolean activo);
}
package com.example.API_de_buses.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.API_de_buses.Modelo.Bus;
import com.example.API_de_buses.Repository.BusRepository;

import java.util.List;
import java.util.Optional;

@Service
public class BusService {

    @Autowired
    private BusRepository busRepository;

    public List<Bus> getAllBuses() {
        return busRepository.findAll();
    }

    public Optional<Bus> getBusById(Long id) {
        return busRepository.findById(id);
    }

    public Bus saveBus(Bus bus) {
        return busRepository.save(bus);
    }

    public List<Bus> getActiveBuses() {
        return busRepository.findByActivo(true);
    }
}

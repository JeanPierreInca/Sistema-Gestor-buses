package com.example.API_de_buses.Controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.API_de_buses.Modelo.Bus;
import com.example.API_de_buses.Services.BusService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/bus")
public class BusController {

    @Autowired
    private BusService busService;
 // Método para obtener todos los buses
    @GetMapping
    public List<Bus> getAllBuses() {
        return busService.getAllBuses();
    }
 // Método para obtener un bus por su ID
    @GetMapping("/{id}")
    public Optional<Bus> getBusById(@PathVariable Long id) {
        return busService.getBusById(id);
    }
    
         //Endpoints adicionales
    
 // Método para registrar un nuevo bus 
   // @PostMapping
   // public Bus createBus(@RequestBody Bus bus) {
    //    return busService.saveBus(bus);
    //}
    
    
  // Método para obtener solo los buses activos
    @GetMapping("/active")
    public List<Bus> getActiveBuses() {
        return busService.getActiveBuses();
    }
}

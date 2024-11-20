package com.example.API_de_buses.Modelo;
import jakarta.persistence.*;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
@Table(name = "buses")
public class Bus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "numero_bus", nullable = false, length = 20)
    private String numeroBus;

    @Column(name = "placa", nullable = false, length = 15)
    private String placa;

    @Column(name = "fecha_creacion", nullable = false, updatable = false)
    private Timestamp fechaCreacion = new Timestamp(System.currentTimeMillis());

    @Column(name = "caracteristicas", columnDefinition = "TEXT")
    private String caracteristicas;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "marca_id", referencedColumnName = "id")
    @JsonManagedReference // Esta asegura que Marca se serialice correctamente
    private Marca marca;

    @Column(name = "activo", nullable = false)
    private Boolean activo;

 // Constructor vacío para JPA
    public Bus() {}

    // Constructor con parámetros
    public Bus(Long id, String numeroBus, String placa, java.sql.Timestamp fechaCreacion, String caracteristicas, Marca marca, Boolean activo) {
        this.id = id;
        this.numeroBus = numeroBus;
        this.placa = placa;
        this.fechaCreacion = fechaCreacion;
        this.caracteristicas = caracteristicas;
        this.marca = marca;
        this.activo = activo;
    }
    
    
    @PrePersist
    protected void onCreate() {
        this.fechaCreacion = new Timestamp(System.currentTimeMillis());
    }


    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumeroBus() {
        return numeroBus;
    }

    public void setNumeroBus(String numeroBus) {
        this.numeroBus = numeroBus;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Timestamp getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Timestamp fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }
    
 // Método toString()
    @Override
    public String toString() {
        return "Bus{id=" + id + ", numeroBus='" + numeroBus + "', placa='" + placa + "', fechaCreacion=" + fechaCreacion + ", caracteristicas='" + caracteristicas + "', marca=" + marca.getNombre() + ", activo=" + activo + "}";
    }
}

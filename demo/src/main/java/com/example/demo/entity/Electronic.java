package com.example.demo.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class Electronic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Integer anio;
    private String brand;
    private Integer price;
    private String modelo;

    public long getId() {
        return id;
    }

    public Integer getAnio() {
        return anio;
    }

    public String getBrand() {
        return brand;
    }

    public Integer getPrice() {
        return price;
    }

    public String getModelo() {
        return modelo;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}

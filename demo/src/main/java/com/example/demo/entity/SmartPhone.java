package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "Electronic")
public class SmartPhone extends Electronic{
    private String camera;
    private String ram;

    public String getCamera() {
        return camera;
    }

    public String getRam() {
        return ram;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }
}

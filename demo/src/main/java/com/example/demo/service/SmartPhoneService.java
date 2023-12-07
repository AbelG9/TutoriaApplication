package com.example.demo.service;

import com.example.demo.entity.SmartPhone;
import com.example.demo.request.RequestElectronic;

import java.util.List;

public interface SmartPhoneService {
    SmartPhone crearSmartPhone(RequestElectronic requestElectronic);
    SmartPhone updateSmartPhone(Long id, RequestElectronic requestElectronic);
    SmartPhone updatePrice(Long id, RequestElectronic requestElectronic);
    SmartPhone findSmartPhoneById(Long id);
    boolean deleteSmartPhoneById(Long id);
    List<SmartPhone> getAll();
}

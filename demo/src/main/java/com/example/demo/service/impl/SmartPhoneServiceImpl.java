package com.example.demo.service.impl;

import com.example.demo.dao.SmartPhoneDao;
import com.example.demo.entity.SmartPhone;
import com.example.demo.request.RequestElectronic;
import com.example.demo.service.SmartPhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

//logica de negocio
@Service
public class SmartPhoneServiceImpl implements SmartPhoneService {
    @Autowired //instancia por detras //inyeccion de dependencias
    SmartPhoneDao smartPhoneDao;

    @Override
    public SmartPhone crearSmartPhone(RequestElectronic requestElectronic) {
        SmartPhone smartPhoneCreate = new SmartPhone();
        smartPhoneCreate.setAnio(requestElectronic.getAnio());
        smartPhoneCreate.setBrand(requestElectronic.getBrand());
        smartPhoneCreate.setCamera(requestElectronic.getCamera());
        smartPhoneCreate.setRam(requestElectronic.getRam());
        smartPhoneCreate.setModelo(requestElectronic.getModel());
        smartPhoneCreate.setPrice(requestElectronic.getPrice());
        smartPhoneDao.save(smartPhoneCreate);
        return smartPhoneCreate;
    }

    @Override
    public SmartPhone updateSmartPhone(Long id, RequestElectronic requestElectronic) {
        SmartPhone smartPhone = findSmartPhoneById(id);
        if (smartPhone != null){
            smartPhone.setAnio(requestElectronic.getAnio());
            smartPhone.setBrand(requestElectronic.getBrand());
            smartPhone.setCamera(requestElectronic.getCamera());
            smartPhone.setRam(requestElectronic.getRam());
            smartPhone.setModelo(requestElectronic.getModel());
            smartPhone.setPrice(requestElectronic.getPrice());
            smartPhoneDao.save(smartPhone);
            return smartPhone;
        }
        return null;
    }

    @Override
    public SmartPhone updatePrice(Long id, RequestElectronic requestElectronic) {
        SmartPhone smartPhone = findSmartPhoneById(id);
        if (smartPhone != null){
            smartPhone.setPrice(requestElectronic.getPrice());
            smartPhoneDao.save(smartPhone);
            return smartPhone;
        }
        return null;
    }

    @Override
    public SmartPhone findSmartPhoneById(Long id) {
        return smartPhoneDao.findById(id).orElse(null);
    }

    @Override
    public boolean deleteSmartPhoneById(Long id) {
        smartPhoneDao.deleteById(id);
        return true;
    }

    @Override
    public List<SmartPhone> getAll() {
        return smartPhoneDao.findAll();
    }
}

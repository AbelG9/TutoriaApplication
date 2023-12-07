package com.example.demo.controller;

import com.example.demo.entity.SmartPhone;
import com.example.demo.request.RequestElectronic;
import com.example.demo.service.SmartPhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/smartphone")
public class SmartPhoneController {

    @Autowired
    SmartPhoneService smartPhoneService;

    @PostMapping("/addSmartphone")
    public SmartPhone addSmartphone(@RequestBody RequestElectronic requestElectronic){
        return smartPhoneService.crearSmartPhone(requestElectronic);
    }

    @PutMapping("/updateSmartphone/{id}")
    public SmartPhone updateSmartphone(@PathVariable Long id, @RequestBody RequestElectronic requestElectronic){
        return smartPhoneService.updateSmartPhone(id, requestElectronic);
    }

    @PatchMapping("/updatePrice/{id}")
    public SmartPhone updatePrice(@PathVariable Long id, @RequestBody RequestElectronic requestElectronic){
        return smartPhoneService.updatePrice(id, requestElectronic);
    }

    @GetMapping("/getSmartphone/{id}")
    public SmartPhone getSmartPhone(@PathVariable Long id){
        return smartPhoneService.findSmartPhoneById(id);
    }

    @DeleteMapping("/deleteSmartPhone/{id}")
    boolean deleteSmartPhone(@PathVariable Long id){
        return smartPhoneService.deleteSmartPhoneById(id);
    }

    @GetMapping("/getAll")
    List<SmartPhone> findAllSmartPhones(){
        return smartPhoneService.getAll();
    }
}

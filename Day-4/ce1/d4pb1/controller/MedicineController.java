package com.example.d4pb1.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.d4pb1.model.Medicine;
import com.example.d4pb1.service.MedicineService;

@RestController
public class MedicineController {
    @Autowired
    MedicineService mService;

    @PostMapping("/mpost")
    public Medicine addMedicine(@RequestBody Medicine m)
    {
        return mService.addMedicine(m);
    }

    @GetMapping("/mget")
    public List<Medicine> getMedicine()
    {
        return mService.getMedicine();
    }

    @GetMapping("/mget/{medicineId}")
    public Optional<Medicine> getMedById(@PathVariable Long medicineId)
    {
        return mService.getMedById(medicineId);
    }

    @PutMapping("/medit/{medicineId}")
    public Medicine editMed(@PathVariable Long medicineId,@RequestBody Medicine m)
    {
        return mService.editMedicine(medicineId, m);
    }

    @DeleteMapping("/mdel/{medicineId}")
    public String delMed(@PathVariable Long medicineId)
    {
        return mService.deleteMedicine(medicineId);
    }
}

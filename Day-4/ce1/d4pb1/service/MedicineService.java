package com.example.d4pb1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.d4pb1.model.Medicine;
import com.example.d4pb1.repository.MedicineRepo;

@Service
public class MedicineService {
    @Autowired//to access all in MedicineRepo
    MedicineRepo  mRepo;

    @SuppressWarnings("null")
    public Medicine addMedicine(Medicine m)
    {
        return mRepo.save(m);//save object into db
    }

    public List<Medicine> getMedicine()
    {
        return mRepo.findAll();//fetch all obj from db
    }

    @SuppressWarnings("null")
    public Optional<Medicine> getMedById(Long medicineId)
    {
        return mRepo.findById(medicineId);
    }

    public Medicine editMedicine(Long medicineId,Medicine m)
    {
        @SuppressWarnings("null")
        Medicine medAvail=mRepo.findById(medicineId).orElse(null);

        if(medAvail!=null)
        {
            medAvail.setMedicineName(m.getMedicineName());
            medAvail.setMedicineFor(m.getMedicineFor());
            medAvail.setMedicineBrand(m.getMedicineBrand());
            medAvail.setManufacturedIn(m.getManufacturedIn());
            medAvail.setMedicinePrice(m.getMedicinePrice());
            medAvail.setExpiryDate(m.getExpiryDate());

            return mRepo.saveAndFlush(medAvail);
        }
        else
        {
            return null;
        }
    }

    @SuppressWarnings("null")
    public String deleteMedicine(Long medicineId)
    {
        mRepo.deleteById(medicineId);
        return ("Medicine Deleted");
    }
}

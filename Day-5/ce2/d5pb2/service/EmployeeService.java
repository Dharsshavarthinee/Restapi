package com.example.d5pb2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.d5pb2.model.Employee;
import com.example.d5pb2.repository.EmployeeRepo;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepo eRepo;

    public Employee postEmployee(Employee e)
    {
        return eRepo.save(e);
    }

    public Employee editEmployee(Employee e,int employeeId)
    {
        Employee avail=eRepo.findById(employeeId).orElse(null);
        if(avail!=null)
        {
            avail.setEmployeeId(e.getEmployeeId());
            avail.setEmployeeName(e.getEmployeeName());
            avail.setEmployeeEmail(e.getEmployeeEmail());
            avail.setDepartment(e.getDepartment());
            avail.setSalary(e.getSalary());

            return eRepo.saveAndFlush(avail);
        }
        else 
        {
            return null;
        }
    }

    public boolean deleteById(int employeeId)
    {
        if(eRepo.existsById(employeeId))
        {
            eRepo.deleteById(employeeId);
            return true;
        }
        else{
            return false;
        }
    }
}

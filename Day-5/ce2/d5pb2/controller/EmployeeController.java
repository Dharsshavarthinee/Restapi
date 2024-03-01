package com.example.d5pb2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.d5pb2.model.Employee;
import com.example.d5pb2.service.EmployeeService;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService eService;


    @PostMapping("/api/employee")
    public ResponseEntity <Employee> pEmployee(@RequestBody Employee e)
    {
        return new ResponseEntity<>(eService.postEmployee(e),HttpStatus.CREATED);
    }

    @PutMapping("/api/employee/{employeeId}")
    public ResponseEntity<?> putEmployee(@RequestBody Employee e,@PathVariable int employeeId)
    {
        try{
            return ResponseEntity.status(200).body(eService.editEmployee(e, employeeId));
        }
        catch(Exception exp){
            return ResponseEntity.status(404).build();
        }
    }

    @DeleteMapping("/api/employee/{employeeId}")
    public ResponseEntity<?> delEmployee(@PathVariable int employeeId)
    {
        try{
   
            return ResponseEntity.status(200).body(eService.deleteById(employeeId));
       }
       catch(Exception e)
       {
            return ResponseEntity.status(404).build();
       }
    }
    
}

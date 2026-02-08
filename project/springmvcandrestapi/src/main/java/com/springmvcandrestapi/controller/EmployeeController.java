package com.springmvcandrestapi.controller;

import com.springmvcandrestapi.dto.EmployeeDTO;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
public class EmployeeController {

    @GetMapping(path="/secretmessage")
    public String getMessage(){
       return "Here is your messagessss";
    }

    @GetMapping(path="/employee/{employeeId}")
    public EmployeeDTO getEmployeeById(@PathVariable Long employeeId){
        return new EmployeeDTO(employeeId, "Purva", 40000.00, LocalDate.of(2023,01,11), true );
    }

    @PostMapping(path = "/create/employee")
    public EmployeeDTO createEmployeeById(@RequestBody EmployeeDTO req){
       return req;
   }

}

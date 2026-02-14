package com.springmvcandrestapi.controller;

import com.springmvcandrestapi.dto.EmployeeDTO;
import com.springmvcandrestapi.services.IEmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/employee")
public class EmployeeController {

    IEmployeeService employeeService;

    public EmployeeController(IEmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(path="/all")
    public List<EmployeeDTO> getEmployeeDetails(){
        return employeeService.getEmployeeDetails();
    }

    @RequestMapping(path="/create")
    public EmployeeDTO createEmployee(@RequestBody EmployeeDTO employeeDTO){
        return employeeService.createEmployeeDetails(employeeDTO);
    }

    @PutMapping(path = "/update/{employeeId}")
    public EmployeeDTO updateEmployeeDetails(@PathVariable Long employeeId, @RequestBody EmployeeDTO employeeDTO){
        return employeeService.updateEmployeeDetails(employeeId, employeeDTO);
    }

    @DeleteMapping(path="/delete/{employeeId}")
    public boolean deleteEmployeeById(@PathVariable Long employeeId){
        return employeeService.deleteEmployeeById(employeeId);
    }

}

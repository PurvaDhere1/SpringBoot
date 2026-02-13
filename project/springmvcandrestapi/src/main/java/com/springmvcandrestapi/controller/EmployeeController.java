package com.springmvcandrestapi.controller;

import com.springmvcandrestapi.dto.EmployeeDTO;
import com.springmvcandrestapi.services.IEmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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

}

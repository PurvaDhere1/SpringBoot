package com.springmvcandrestapi.services;

import com.springmvcandrestapi.dto.EmployeeDTO;

import java.util.List;

public interface IEmployeeService {

    public List<EmployeeDTO> getEmployeeDetails();

    public EmployeeDTO createEmployeeDetails(EmployeeDTO employeeDTO);
}

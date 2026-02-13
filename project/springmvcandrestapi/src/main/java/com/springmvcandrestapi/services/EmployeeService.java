package com.springmvcandrestapi.services;

import com.springmvcandrestapi.dto.EmployeeDTO;
import com.springmvcandrestapi.entities.EmployeeEntity;
import com.springmvcandrestapi.repositories.EmployeeRespository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService implements IEmployeeService{

    private final EmployeeRespository employeeRespository;
    private final ModelMapper modelMapper;

    public EmployeeService(EmployeeRespository employeeRespository, ModelMapper modelMapper) {
        this.employeeRespository = employeeRespository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<EmployeeDTO> getEmployeeDetails(){

        List<EmployeeEntity> employeeEntities = employeeRespository.findAll();
        return employeeEntities
                .stream()
                .map(employeeEntity -> modelMapper.map(employeeEntity,EmployeeDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public EmployeeDTO createEmployeeDetails(EmployeeDTO employeeDTO) {
       EmployeeEntity mapEmployeeEntity = modelMapper.map(employeeDTO, EmployeeEntity.class);
        EmployeeEntity savedEmployeeEntity = employeeRespository.save(mapEmployeeEntity);
        return modelMapper.map(savedEmployeeEntity,EmployeeDTO.class);
    }

}

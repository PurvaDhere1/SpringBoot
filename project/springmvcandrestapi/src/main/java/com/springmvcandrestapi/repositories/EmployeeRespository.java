package com.springmvcandrestapi.repositories;

import com.springmvcandrestapi.dto.EmployeeDTO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRespository extends JpaRepository<Long, EmployeeDTO> {
    public List<EmployeeDTO> findAllById();
}

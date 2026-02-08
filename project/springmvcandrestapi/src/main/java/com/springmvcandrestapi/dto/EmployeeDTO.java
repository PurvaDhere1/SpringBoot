package com.springmvcandrestapi.dto;

import java.time.LocalDate;

public class EmployeeDTO {
    private Long id;
    private String name;
    private Double salary;
    private LocalDate dateOfJoining;
    private boolean isActive;

    public EmployeeDTO() {
    }

    public EmployeeDTO(Long id, String name, Double salary, LocalDate dateOfJoining, boolean isActive) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.dateOfJoining = dateOfJoining;
        this.isActive = isActive;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public LocalDate getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(LocalDate dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "EmployeeDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", dateOfJoining=" + dateOfJoining +
                ", isActive=" + isActive +
                '}';
    }
}

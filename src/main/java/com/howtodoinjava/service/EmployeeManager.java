package com.dellnaresh.service;

import java.util.List;

import com.dellnaresh.entity.EmployeeEntity;

public interface EmployeeManager {
	public void addEmployee(EmployeeEntity employee);
    public List<EmployeeEntity> getAllEmployees();
    public void deleteEmployee(Integer employeeId);
}

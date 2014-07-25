package com.dellnaresh.dao;

import com.dellnaresh.entity.EmployeeEntity;
import java.io.Serializable;
import java.util.List;

public interface EmployeeDAO extends Serializable
{
    public void addEmployee(EmployeeEntity employee);
    public List<EmployeeEntity> getAllEmployees();
    public void deleteEmployee(Integer employeeId);
}
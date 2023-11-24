package com.bijanghanei.MyRestAPI.service;

import com.bijanghanei.MyRestAPI.dao.EmployeeDAO;
import com.bijanghanei.MyRestAPI.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService{
    private EmployeeDAO employeeDAO;

    @Autowired
    public EmployeeServiceImpl(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @Override
    public List<Employee> findAll() {
        return null;
    }
}

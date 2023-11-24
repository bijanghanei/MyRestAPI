package com.bijanghanei.MyRestAPI.dao;

import com.bijanghanei.MyRestAPI.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}

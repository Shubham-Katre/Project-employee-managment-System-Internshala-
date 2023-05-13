package com.geekster.Employee.address.services;

import com.geekster.Employee.address.models.Employee;
import com.geekster.Employee.address.repositories.IEmployeeRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    IEmployeeRepository employeeRepository;

    public void add(Employee employees) {
        employeeRepository.save(employees);
    }

    public Iterable<Employee> getAllEmployeeDetails() {
        return employeeRepository.findAll();
    }

    public Optional<Employee> getEmployeesId(Integer id) {
        return employeeRepository.findById(id);
    }
    @Transactional
    public String updateEmployeeNow(Employee employee, Integer id) {
        employeeRepository.updateEmployee(employee.getName() , employee.getPhoneNo() , id);
        return "Employee Updated Successfully";
    }

    public String deleteEmployeeDetails(Integer id) {
        employeeRepository.deleteById(id);
        return "Employee deleted Successfully";
    }

}

package com.geekster.Employee.address.controllers;

import com.geekster.Employee.address.models.Employee;
import com.geekster.Employee.address.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping("/addEmployees")
    public void AddEmployees(@RequestBody Employee employees){

        employeeService.add(employees);
    }

    @GetMapping(value = "/getAllEmployee")
    public Iterable<Employee> GetAllEmployee(){

        return employeeService.getAllEmployeeDetails();
    }

    @GetMapping("/getAllEmployeesById/{id}")
    public Optional<Employee> GetAllEmployeesById(@PathVariable Integer id){
        return employeeService.getEmployeesId(id);
    }

    @PutMapping(value = "/updateEmployee/{id}")
    public String UpdateEmployee(@RequestBody Employee employee , @PathVariable Integer id)
    {
        return employeeService.updateEmployeeNow(employee , id);
    }

    @DeleteMapping(value = "/deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable Integer id){

        return employeeService.deleteEmployeeDetails(id);
    }

}

package com.geekster.Employee.address.repositories;

import com.geekster.Employee.address.models.Employee;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmployeeRepository extends CrudRepository<Employee , Integer> {
     @Modifying
     @Query(value = "update employee_table set name = :name , phone_no = :phoneNo where id = :id" , nativeQuery = true)
    void updateEmployee(String name, String phoneNo, Integer id);


}

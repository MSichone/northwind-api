package com.masgotcode.northwind.employee;

import com.masgotcode.northwind.customer.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {

    private final Logger log = LoggerFactory.getLogger(EmployeeService.class);

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Iterable<Employee> getAllEmployees(){
        log.info("EmployeeService.getAllEmployees");
        return employeeRepository.findAll();
    }

    public Optional<Employee> getEmployeeById(Long id){
        log.info("EmployeeService.getEmployeeById["+id+"]");
        return employeeRepository.findById(id);
    }

}

package com.lxhuy.spring.service;


import com.lxhuy.spring.model.Employee;
import com.lxhuy.spring.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    public Employee create(Employee employee) {
        return employeeRepository.save(employee);
    }

    public void delete(long id) {
        employeeRepository.deleteById(id);
    }


    public Employee update(Employee employee) {
        Employee employeeOptional = employeeRepository.findById(employee.getId())
                .orElseThrow();
        if (employee.getName() != null) {
            employeeOptional.setName(employee.getName());
        }

        if (employee.getAddress() != null) {
            employeeOptional.setAddress(employee.getAddress());
        }

        if (employee.getPhoneNumber() != null) {
            employeeOptional.setPhoneNumber(employee.getPhoneNumber());
        }

        if (employee.getAge() != null) {
            employeeOptional.setAge(employee.getAge());
        }
        return employeeRepository.save(employeeOptional);
    }
}

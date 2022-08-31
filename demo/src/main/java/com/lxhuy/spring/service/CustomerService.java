package com.lxhuy.spring.service;

import com.lxhuy.spring.model.Customer;
import com.lxhuy.spring.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CustomerService {
    private final CustomerRepository customerRepository;

    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    public Customer create(Customer customer) {
        return customerRepository.save(customer);
    }

    public void delete(Long id) {
        customerRepository.deleteById(id);
    }

    public Customer findById(Long id) {
        return customerRepository.findById(id).get();
    }
}

/// CustomerService s = new C...
// s.findAll
// -> spring -> support -> spring bean -> auto create object

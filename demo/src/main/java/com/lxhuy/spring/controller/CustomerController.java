package com.lxhuy.spring.controller;

import com.lxhuy.spring.model.Customer;
import com.lxhuy.spring.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/customers")
public class CustomerController {
    private final CustomerService customerService;

    @GetMapping
    public List<Customer> findAll() {

        return customerService.findAll();
    }

    @PostMapping
    public Customer create(@RequestBody Customer customer) {
        return customerService.create(customer);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Long id) {

        customerService.delete(id);
    }

    @GetMapping("/{id}")
    public Customer findById(@PathVariable("id") Long id) {

        return customerService.findById(id);
    }
}

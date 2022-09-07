package com.lxhuy.spring.controller;

import com.lxhuy.spring.model.Company;
import com.lxhuy.spring.service.CompanyService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/companies")
public class CompanyController {
    private final CompanyService companyService;

    @GetMapping
    public List<Company> findAll() {

        return companyService.findAll();
    }

    @PostMapping
    public Company create(@RequestBody Company company) {
        return companyService.create(company);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Long id){
        companyService.delete(id);
    }
}

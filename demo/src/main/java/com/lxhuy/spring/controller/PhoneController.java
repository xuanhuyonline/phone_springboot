package com.lxhuy.spring.controller;

import com.lxhuy.spring.model.Company;
import com.lxhuy.spring.model.Employee;
import com.lxhuy.spring.model.Phone;
import com.lxhuy.spring.service.PhoneService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/phones")
@AllArgsConstructor
public class PhoneController {
    private final PhoneService phoneService;

    @GetMapping
    public List<Phone> findAll() {
        return phoneService.findAll();
    }


    @PostMapping
    public Phone create (@RequestBody Phone phone) {
        return phoneService.create(phone);
    }

    @PutMapping
    public Phone update (@RequestBody Phone phone) {
        return  phoneService.update(phone);
    }

}

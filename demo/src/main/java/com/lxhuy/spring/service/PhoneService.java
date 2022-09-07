package com.lxhuy.spring.service;

import com.lxhuy.spring.model.Phone;
import com.lxhuy.spring.repository.PhoneRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PhoneService {
    private final PhoneRepository phoneRepository;

    public List<Phone> findAll() {
        return phoneRepository.findAll();
    }


    public Phone create(Phone phone) {
        return phoneRepository.save(phone);
    }
}

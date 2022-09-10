package com.lxhuy.spring.service;

import com.lxhuy.spring.model.Company;
import com.lxhuy.spring.model.Customer;
import com.lxhuy.spring.model.Employee;
import com.lxhuy.spring.model.Phone;
import com.lxhuy.spring.repository.CompanyRepository;
import com.lxhuy.spring.repository.PhoneRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PhoneService {
    private final PhoneRepository phoneRepository;
    private final CompanyRepository companyRepository;

    public List<Phone> findAll() {
        return phoneRepository.findAll();
    }


    public Phone create(Phone phone) {
        Company company = companyRepository.findById(phone.getCompany().getId()).get();
        phone.setCompany(company);
        return phoneRepository.save(phone);
    }

    public Phone update(Phone phone) {
        Phone phoneOptional = phoneRepository.findById(phone.getId()).orElseThrow();
        if (phone.getName() != null){
            phoneOptional.setName(phone.getName());
        }

        if (phone.getScreen() != null){
            phoneOptional.setScreen(phone.getScreen());
        }

        if(phone.getChip() != null){
            phoneOptional.setChip(phone.getChip());
        }

        if(phone.getRam() != null) {
            phoneOptional.setRam(phone.getRam());
        }

        if(phone.getPin() != null) {
            phoneOptional.setPin(phone.getPin());
        }

        if(phone.getPrice() != null) {
            phoneOptional.setPrice(phone.getPrice());
        }

        return phoneRepository.save(phoneOptional);
    }

    public Phone findById(Long id) {
        return phoneRepository.findById(id).get();
    }

    public void delete(Long id) {
        phoneRepository.deleteById(id);
    }
}
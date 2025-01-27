package com.example.react.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.react.model.Vendor;
import com.example.react.repository.VendorRepository;
import java.util.List;

@Service
public class VendorService {
    @Autowired
    private VendorRepository vendorRepository;
    public List<Vendor> getAllvendors() {
        return vendorRepository.findAll();
    }
    public Vendor getvendorById(Long id) {
        return vendorRepository.findById(id).orElse(null);
    }
    public void addvendor(Vendor vendor) {
        vendorRepository.save(vendor);
    }
    public void deletevendor(Long id) {
        vendorRepository.deleteById(id);   
    }
    public void updatevendor(Vendor vendor) {
        vendorRepository.save(vendor);
    }
}

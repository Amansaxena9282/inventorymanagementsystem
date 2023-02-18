package com.eleservsoftech.inventory.service;
import com.eleservsoftech.inventory.model.Vendor;
import com.eleservsoftech.inventory.repository.VendorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface VendorService {
//    @Autowired
//    public VendorRepository vendorRepository=null;
    public List<Vendor>getAll();
    public Vendor getById(Long id);
    public Vendor addVendor (Vendor vendor);
    public Vendor updateVendor (Vendor vendor);
    public String deleteVendor (Long id);
}

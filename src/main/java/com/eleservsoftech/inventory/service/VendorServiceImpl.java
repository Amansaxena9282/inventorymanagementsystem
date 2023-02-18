package com.eleservsoftech.inventory.service;
import com.eleservsoftech.inventory.model.Vendor;
import com.eleservsoftech.inventory.repository.VendorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VendorServiceImpl implements VendorService{
    @Autowired
    private VendorRepository vendorRepository;
    @Override
    public List<Vendor> getAll() {
        return vendorRepository.findAll();
    }
    @Override
    public Vendor getById(Long id) {
        return vendorRepository.findById(id).get();
    }
    @Override
    public Vendor addVendor(Vendor vendor) {
        return vendorRepository.save(vendor);
    }
    @Override
    public Vendor updateVendor(Vendor vendor) {
        Vendor vendor1=vendorRepository.getReferenceById(vendor.getVendor_id());
     if(vendor.getName()!=null)
         vendor1.setName(vendor.getName());
        if(vendor.getVendor_Code()!=null)
            vendor1.setVendor_Code(vendor.getVendor_Code());
        if(vendor.getCreated_by()!=null)
            vendor1.setCreated_by(vendor.getCreated_by());
        if(vendor.getLast_Modified_by()!=null)
            vendor1.setLast_Modified_by(vendor.getLast_Modified_by());
        if(vendor.getIsdelete()!=null)
     vendor1.setIsdelete(vendor.getIsdelete());
        return vendorRepository.save(vendor1);
    }
    @Override
    public String deleteVendor(Long id) {
        vendorRepository.deleteById(id);

        return "vendorId:"+id+"deleted";
    }
}

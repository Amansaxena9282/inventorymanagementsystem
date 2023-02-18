package com.eleservsoftech.inventory.controller;
import com.eleservsoftech.inventory.model.Vendor;
import com.eleservsoftech.inventory.service.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import java.util.List;
//import static com.sun.xml.bind.v2.runtime.JAXBContextImpl.db;
@RestController
@RequestMapping("/api/v1")
public class VendorController {
    @Autowired
    private VendorService vendorService;
    @GetMapping("/getAll")
    public List<Vendor>getAll(){
        return vendorService.getAll();
    }

//    @GetMapping("/get/{id}")
//    public Vendor getVendorById(@PathVariable Long id) {
//        Vendor vendor =vendorService.getById(id);
////        if(vendor==null)
////            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
//        return vendor;
//    }
    @PostMapping("/save")
    public Vendor addVendor (@RequestBody Vendor vendor){
//       vendor.setVendor_id(vendor.getVendor_id());
       vendorService.addVendor(vendor);
        return vendor;
    }
    @PutMapping("/edit")
    public Vendor updateVendor (@RequestBody Vendor vendor){
        return vendorService.updateVendor(vendor);
    }
    @DeleteMapping("/delete")
    public String deleteVendor (@PathVariable Long id){
        return vendorService.deleteVendor(id);
    }



}

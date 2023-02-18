package com.eleservsoftech.inventory.repository;
import com.eleservsoftech.inventory.model.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;
import javax.persistence.Id;
import java.util.List;
public interface VendorRepository extends JpaRepository<Vendor,Long> {
//   Vendor (String Vendor_id);
//    @Override
//    Vendor getReferenceById(Long Long);
//
//    List<Vendor> getReferenceById();
}

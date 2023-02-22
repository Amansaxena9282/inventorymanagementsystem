package com.eleservsoftech.inventory.repository;
import com.eleservsoftech.inventory.model.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;
import java.util.List;
@Repository
@EnableJpaRepositories
public interface VendorRepository extends JpaRepository<Vendor,Long> {
//   Vendor (String Vendor_id);
//    @Override
//    Vendor getReferenceById(Long Long);
//
//    List<Vendor> getReferenceById();
}

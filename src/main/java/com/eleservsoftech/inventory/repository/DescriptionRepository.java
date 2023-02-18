package com.eleservsoftech.inventory.repository;

import com.eleservsoftech.inventory.model.*;
import com.eleservsoftech.inventory.model1.Account;
import com.eleservsoftech.inventory.model1.Planning;
import com.eleservsoftech.inventory.model1.Stagging;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DescriptionRepository  extends JpaRepository<Description,Long> {
    @Query(
            value = "call case_details(?1,?2)",
            nativeQuery = true)
    public List<Dispatched_scan> getCaseDetailsforDispatch(String id, String details);

    @Query(
            value = "call case_details(?1,?2)",
            nativeQuery = true)
    public List<Account> getCaseDetailsforAcount(String id, String details);

    @Query(
            value = "call case_details(?1,?2)",
            nativeQuery = true)
    public List<Planning> getCaseDetailsforPlanning(String id, String details);

    @Query(
            value = "call case_details(?1,?2)",
            nativeQuery = true)
    public List<Stagging> getCaseDetailsforStagging(String id, String details);

}

package com.eleservsoftech.inventory.repository;
import com.eleservsoftech.inventory.model.*;
import com.eleservsoftech.inventory.model1.Account;
import com.eleservsoftech.inventory.model1.Cc_crm;
import com.eleservsoftech.inventory.model1.Planning;
import com.eleservsoftech.inventory.model1.Stagging;
import com.eleservsoftech.inventory.service.DescriptionService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface DescriptionRepository extends JpaRepository<Description,Long> {

    @Query(
            value = "call case_details(?1,?2)",
            nativeQuery = true)
    public List<com.eleservsoftech.inventory.model1.Dispatched_scan> getCaseDetailsforDispatch(String id, String details);

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
    public List<Cc_crm> getCaseDetailsforCc_crm(String id, String details);
    @Query(
            value = "call case_details(?1,?2)",
            nativeQuery = true)
  public List<Stagging> getCaseDetailsforStagging(String id, String details);

//    @Query(
//            value = "call case_details(?1,?2)",
//            nativeQuery = true)
//   public List<Dispatched_scan> getCaseDetailsforDispatched_scan(String id, String details);
}

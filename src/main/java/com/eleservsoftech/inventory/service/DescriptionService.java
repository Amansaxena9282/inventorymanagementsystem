package com.eleservsoftech.inventory.service;
import com.eleservsoftech.inventory.model.*;
import com.eleservsoftech.inventory.model1.Account;
import com.eleservsoftech.inventory.model1.Cc_crm;
import com.eleservsoftech.inventory.model1.Planning;
import com.eleservsoftech.inventory.model1.Stagging;
import org.springframework.stereotype.Service;

import java.util.List;

public interface DescriptionService {
//   @Autowired
//    DescriptionService descriptionSerrvice =null ;
    public List<Description> getAll();
    public Description getById(Long id);
    public Description addDescription (Description description);
    public Description updateDescription (Description description);
    public String deleteDescription (Long id);
    public List<com.eleservsoftech.inventory.model1.Dispatched_scan> getCaseDetailsforDispatch(String id, String details);
    public List<Account> getCaseDetailsforAcount(String id, String details);
    public List<Planning> getCaseDetailsforPlanning(String id, String details);
    public List<Stagging> getCaseDetailsforStagging(String id, String details);
//    public List<Dispatched_scan> getCaseDetailsforDispatched_scan(String id, String details);
    public List<Cc_crm> getCaseDetailsforCc_crm(String id, String details);


}

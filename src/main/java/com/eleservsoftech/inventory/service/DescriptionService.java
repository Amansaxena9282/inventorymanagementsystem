package com.eleservsoftech.inventory.service;
import com.eleservsoftech.inventory.model.*;
import com.eleservsoftech.inventory.model1.Account;
import com.eleservsoftech.inventory.model1.Planning;
import com.eleservsoftech.inventory.model1.Stagging;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public interface DescriptionService {
    public List<Description>getAll();
    public Description getById(Long id);
    public Description addDescription (Description description);
    public Description updateDescription (Description description);
    public String deleteDescription (Long id);
    public List<Dispatched_scan> getCaseDetailsforDispatch(String id, String details);
    public List<Account> getCaseDetailsforAcount(String id, String details);
    public List<Planning> getCaseDetailsforPlanning(String id, String details);
    public List<Stagging> getCaseDetailsforStagging(String id, String details);

}

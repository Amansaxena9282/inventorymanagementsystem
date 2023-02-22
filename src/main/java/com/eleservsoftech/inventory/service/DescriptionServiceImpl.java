package com.eleservsoftech.inventory.service;
import com.eleservsoftech.inventory.model.*;
import com.eleservsoftech.inventory.model1.Account;
import com.eleservsoftech.inventory.model1.Cc_crm;
import com.eleservsoftech.inventory.model1.Planning;
import com.eleservsoftech.inventory.model1.Stagging;
import com.eleservsoftech.inventory.repository.DescriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.*;
@Service
public class DescriptionServiceImpl implements DescriptionService{
    @Autowired
    private DescriptionRepository descriptionRepository;
   // @Override
//    public  getAll(){
//        List<Description> description = null;
//        description =   descriptionRepository.findAll();
//        description.stream().forEach(i->{
//            Map<String,Object> map = new LinkedHashMap<>();
//            map.put("id",i.getDescription_id());
//            map.put("name",i.getName());
//        });
//    }
    public List<Description> getAll() {
        return descriptionRepository.findAll();
    }
    @Override
    public Description getById(Long id) {
        return descriptionRepository.findById(id).get();
    }
    @Override
    public Description addDescription(Description description) {
        return descriptionRepository.save(description);
    }
    @Override
    public Description updateDescription(Description description) {
        Description description1=descriptionRepository.getReferenceById(description.getDescription_id());
        if(description.getName()!=null)
            description1.setName(description.getName());
        if(description.getDescription_id()!=null)
            description1.setDescription_id(description.getDescription_id());
        if(description.getCreated_by()!=null)
            description1.setCreated_by(description.getCreated_by());
        if(description.getLast_modified_by()!=null)
            description1.setLast_modified_by(description.getLast_modified_by());
        if(description.getIsdelete()!=null)
            description1.setIsdelete(description.getIsdelete());
        return descriptionRepository.save(description1);
    }
    @Override
    public String deleteDescription(Long id) {
        return null;
    }

    @Override
    public List<com.eleservsoftech.inventory.model1.Dispatched_scan> getCaseDetailsforDispatch(String id, String details) {
        return descriptionRepository.getCaseDetailsforDispatch(id, details);
    }
    @Override
    public List<Account> getCaseDetailsforAcount(String id, String details) {
        return descriptionRepository.getCaseDetailsforAcount(id, details);
    }
    @Override
    public List<Planning> getCaseDetailsforPlanning(String id, String details) {
        return descriptionRepository.getCaseDetailsforPlanning(id, details);
    }
    @Override
    public List<Stagging> getCaseDetailsforStagging(String id, String details) {
        return descriptionRepository.getCaseDetailsforStagging(id,details);
    }
//    @Override
//    public List<Dispatched_scan> getCaseDetailsforDispatched_scan(String id, String details) {
//        return descriptionRepository.getCaseDetailsforDispatched_scan(id, details);
//    }
    @Override
    public List<Cc_crm> getCaseDetailsforCc_crm(String id, String details) {
        return descriptionRepository.getCaseDetailsforCc_crm(id,details);
    }
}

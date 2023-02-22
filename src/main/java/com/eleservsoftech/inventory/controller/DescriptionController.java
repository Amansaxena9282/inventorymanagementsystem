package com.eleservsoftech.inventory.controller;
import com.eleservsoftech.inventory.model.Description;
import com.eleservsoftech.inventory.service.DescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@RestController
@RequestMapping("api/v1")
public class DescriptionController {
    @Autowired
     private DescriptionService descriptionService;
    private ResponseEntity<java.util.Map> Map;

    @GetMapping("/getAllData")
    public List<Description>getAll(){
        return descriptionService.getAll();
    }

    @GetMapping("/get/{id}")
    public Description getdescription_id(@PathVariable Long id) {
        Description description=descriptionService.getById(id);
        return description;
    }
    @PostMapping("/savedata")
    public Description addDescription(@RequestBody Description description){
        descriptionService.addDescription(description);
        return description;

    }
    @PutMapping("/editdata")
    public Description updateDescription(@RequestBody Description description){
        descriptionService.updateDescription(description);
        return description;
    }
//    @DeleteMapping("/deletedata")
//    public String deleteDescription(@PathVariable Long id){
//        return descriptionService.deleteDescription(id);
//    }

    @GetMapping("/getCaseDetails")
    public ResponseEntity<Map> getCaseDetails(@RequestParam("id") String caseid, @RequestParam(value = "details",required = false) String details){
        Map<String,Object> map=new HashMap<>();
        Map<String,Object> map1=new HashMap<>();
        if(details !=null){
            String[] words = details.split(",");
            for(String detail:words){
                //Dispatch,Stagging,Planning,Account
                if(detail.equals("Dispatch"))
                    map1.put("Dispatch",descriptionService.getCaseDetailsforDispatch(caseid, details));
                if(detail.equals("Stagging"))
                    map1.put("Stagging",descriptionService.getCaseDetailsforStagging(caseid, detail));
                if(detail.equals("Planning")) {
                    System.out.println("output="+detail);
                    map1.put("Planning", descriptionService.getCaseDetailsforPlanning(caseid, detail));
                }
                if(detail.equals("Account"))
                    map1.put("Account",descriptionService.getCaseDetailsforAcount(caseid, detail));
            }
//            if(details.equals("Dispatched_scan")){
////                String detail = null;
//                map1.put("Dispatched_scan",descriptionService.getCaseDetailsforDispatched_scan(caseid, details));
//            }
            if(details.equals("Cc_crm")){
                map1.put("Cc_crm",descriptionService.getCaseDetailsforCc_crm(caseid, details));
            }
            map.put("status",200);
            map.put("Data",map1);
        }else{
            map1.put("Dispatch",descriptionService.getCaseDetailsforDispatch(caseid, "Dispatch"));

                map1.put("Stagging",descriptionService.getCaseDetailsforStagging(caseid, "Stagging"));

                map1.put("Planning",descriptionService.getCaseDetailsforPlanning(caseid, "Planning"));

                map1.put("Account",descriptionService.getCaseDetailsforAcount(caseid, "Account"));

//                map1.put("Dispatched_scan",descriptionService.getCaseDetailsforDispatched_scan(caseid, "Dispatched_scan"));

                map1.put("Cc_crm",descriptionService.getCaseDetailsforCc_crm(caseid,"Cc_crm"));
            map.put("status",200);
            map.put("Data",map1);
        }


       //if(details.equals("Dispatch"))

        return new ResponseEntity<>(map, HttpStatus.ACCEPTED);
    }
}

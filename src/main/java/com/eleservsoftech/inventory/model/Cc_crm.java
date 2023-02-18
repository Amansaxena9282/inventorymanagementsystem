package com.eleservsoftech.inventory.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.security.Timestamp;
@Data
@NoArgsConstructor
@AllArgsConstructor
//@Entity
//@DynamicInsert
//@DynamicUpdate
public class Cc_crm {
    @Id
    private Long Case_Id;
    private String Patient_Name;
    private String patient_email;
    private String Doctor_Name;
    private String treating_dr_email;
    private String registered_doctor;
    private String clinic_Name;
    private String address;
    private String phone;
    private String phone1;
    private String phone2;
    private String phone3;
    private String phone4;
    private String phone5;
    private Timestamp plan_date;
    private Timestamp plan_time;
    private String crm_name;
    private String delivery_note_no;
    private String bclinic;
    private String badd;
    private String bgst_no;
    private String category;
    private String upper_aligner;
    private String lower_aligner;
    private String others;
    private String case_type;
    private String scan;
    private String location;
    private String  location2;
    private String location3;
    private String location4;
    private String location5;
    private String city;
    private String city2;
    private String city3;
    private String city4;
    private String city5;
    private String r_Doctor;
    private String crm;
    private String p_graph;
    private String starter_kit;
    private String type_request;
    private String s_shown;
    private String ppf_fill;
    private String t_account;
    private String corporate_account;
    private String kol;
    private String c_pkg;
    private String pkg_name;
    private String dispatch_crpt;
    private String dispatch_address;
    private String bill_address;
    private String c_doctor;
    private String case_stage;
    private String priority;
    private String draft;
    private String remark;
    private String holdflag;
    private String user_id;
    private Timestamp CREATED_DATE;
    private String starter_case_stage;
    private String starter_satus;
    private Double total_amount;
    private String payment_processing;
    private String payment_mode;
    private Timestamp inicor_at;
    private Timestamp wfc_at;
    private Timestamp precor_at;
    private Timestamp pre_at;
    private Timestamp plncor_at;
    private Timestamp cadbs_at;
    private Timestamp pln_at;
    private Timestamp uplcor_at;
    private Timestamp upl_at;
    private Timestamp rev_at;
    private Timestamp qa_at;
    private Timestamp ntcnt_at;
    private Timestamp cnl_at;
    private Timestamp stg_at;
    private Timestamp mpt_at;

    @Column(name="3dpcor_at")
    private Timestamp dpcor;
   @Column(name = "3dp_at")
    private Timestamp dpat;
   private Timestamp labcor_at;
   private Timestamp lab_at;
   private Timestamp fqc_at;
   private Timestamp pckcor_at;
   private Timestamp pck_at;
   private Timestamp dispatch;
   private Timestamp inistrkit_at;
   private Timestamp mtpstrkit_at;
   @Column(name = "3dpstrkit_at")
    private Timestamp dpstrkit;
   @Column(name = "3dpstrkitcor_at")
    private Timestamp dpstrkitor;
   private Timestamp labstrkit_at;
   private Timestamp labstrkitcor_at;
   private Timestamp fqcstrkit_at;
   private Timestamp pckstrkit_at;
   private Timestamp pckstrkitcor_at;
   private Timestamp dispatchstrkit;
   private String planning_id;
   private String staging_id;
   private  Timestamp ini_at;
   private Timestamp wfccor_at;
   private String address1;
   private String address2;
   private String address3;
   private String address4;
   private String address5;
   private String default_address;
   private String default_starterkit;
   private String pincode1;
   private String pincode2;
   private String pincode3;
   private String pincode4;
   private String pincode5;
   private  Timestamp next_batch_date;
   private Timestamp created_At;
   private  Timestamp modified_At;
   private  String payment_bill_status;
   private String payment_bill_status_remarks;
}

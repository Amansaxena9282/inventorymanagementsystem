package com.eleservsoftech.inventory.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.security.Timestamp;


//@Entity
//@DynamicInsert
//@DynamicUpdate

public class Account {
    @Id
    private int account_id;
    private String crm;
    private String case_id;
    private String doctor_name;
    private String patient_name;
    private String payment_mode;
    private String payment;
    private Timestamp date;
    private String remain_amount;
    private String paid_amount;
    private String submitted_amount;
    private String revoke_amount;
    private String remarks;
    private String user;
    private Timestamp created_At;
    private String invoice_number;
    private Timestamp invoice_date;

    public int getAccount_id() {
        return account_id;
    }

    public String getCrm() {
        return crm;
    }

    public String getCase_id() {
        return case_id;
    }

    public String getDoctor_name() {
        return doctor_name;
    }

    public String getPatient_name() {
        return patient_name;
    }

    public String getPayment_mode() {
        return payment_mode;
    }

    public String getPayment() {
        return payment;
    }

    public Timestamp getDate() {
        return date;
    }

    public String getRemain_amount() {
        return remain_amount;
    }

    public String getPaid_amount() {
        return paid_amount;
    }

    public String getSubmitted_amount() {
        return submitted_amount;
    }

    public String getRevoke_amount() {
        return revoke_amount;
    }

    public String getRemarks() {
        return remarks;
    }

    public String getUser() {
        return user;
    }

    public Timestamp getCreated_At() {
        return created_At;
    }

    public String getInvoice_number() {
        return invoice_number;
    }

    public Timestamp getInvoice_date() {
        return invoice_date;
    }
}

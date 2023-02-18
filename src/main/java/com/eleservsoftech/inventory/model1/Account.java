package com.eleservsoftech.inventory.model1;

import java.math.BigInteger;
import java.security.Timestamp;

public interface Account {
    public Long getAccount_id();

    public String getCrm() ;


    public String getCase_id() ;

    public String getDoctor_name() ;


    public String getPatient_name() ;

    public String getPayment_mode();

    public String getPayment() ;

    public String getDate() ;

    public String getRemain_amount() ;

    public String getPaid_amount();

    public String getSubmitted_amount();

    public String getRevoke_amount();

    public String getRemarks();

    public String getUser();

    public String getCreated_At() ;

    public String getInvoice_number() ;

    public String getInvoice_date();
}

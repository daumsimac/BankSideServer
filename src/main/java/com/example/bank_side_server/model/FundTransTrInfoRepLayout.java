package com.example.bank_side_server.model;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Getter
@Setter
public class FundTransTrInfoRepLayout {

    private String debitResourceNumber;
    private String creditResourceNumber;
    private String transactionId;
    private String vatAmount;
    private String transferFee;
    private String bankRefNo;
    private String tranErrorCode;
    private String tranErrorDesc;
    private String transDesc;
    private String sendDT;
    private String wdrAfBlMrk;
    private String wdrAfBl;

    @SuppressWarnings("static-access")
    public String toString(){
        return new ToStringBuilder(this).reflectionToString (this, ToStringStyle.JSON_STYLE);
    }
}

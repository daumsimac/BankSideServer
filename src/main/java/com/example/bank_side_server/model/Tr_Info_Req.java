package com.example.bank_side_server.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Tr_Info_Req {

    private String transactionId;
    private String priority;
    private String debitType;
    private String debitResourceNumber;
    private String debitName;
    private String debitAddr;
    private String debitCity;
    private String debitCountry;
    private String debitBranchId;
    private String debitBankId;
    private String currencyCode;
    private String creditEmail;
    private String creditPhoneNo;
    private String creditBankId;
    private String creditIdIssueBy;
    private String creditCountry;
    private String creditIdIssueDate;
    private String creditIdCard;
    private String creditType;
    private String creditResourceNumber;
    private String creditName;
    private String creditAddr;
    private String creditCity;
    private String transferAmount;
    private String transDesc;
    private String payRefNo;
    private String payRefInfor;

    @SuppressWarnings("static-access")
    public String toString(){
        return new ToStringBuilder(this).reflectionToString (this, ToStringStyle.JSON_STYLE);
    }

}

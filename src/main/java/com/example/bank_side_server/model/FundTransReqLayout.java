package com.example.bank_side_server.model;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "ROOT")
@XmlAccessorType(XmlAccessType.FIELD)
@Getter
@Setter
public class FundTransReqLayout {

    private String clientMessageId;
    private String providerId;
    private String orgCode;
    private String merchantId;
    private String merchantName;
    private String serviceId;
    private String customerLevel;
    private String customerType;
    private String remittanceType;
    private String transferFee;
    private String disCountCode;
    private String feeType;
    private String sendDT;
    private String transDate;
    private String verifyByBank;
    private String verifyMethod;
    private String verifyInfor;
    private String channelId;
    private String otp;
    private String OTPReqId;
    private String linkType;
    private String walletId;
    private String feeInclYn;
    private String processedRecord;
    private List<FundTransReqLayout> tr_infos;

    @SuppressWarnings("static-access")
    public String toString(){
        return new ToStringBuilder(this).reflectionToString (this, ToStringStyle.JSON_STYLE);
    }
}

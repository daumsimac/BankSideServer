package com.example.bank_side_server.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ROOT")
@XmlAccessorType(XmlAccessType.FIELD)
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FirmInqBeneReqLayer {

    private String clientMessageId;
    private String transactionId;
    private String orgCode;
    private String providerId;
    private String merchantId;
    private String serviceId;
    private String sendDT;
    private String channelId;
    private String walletId;
    private String debitBankId;
    private Integer processedRecord;
    private String debitResourceNumber;
    private String creditBankId;
    private String creditType;
    private String creditResourceNumber;
    private String remittanceType;

    public FirmInqBeneReqLayer() {
        init();
    }

    private void init(){
        this.setClientMessageId("");
        this.setTransactionId("");
        this.setOrgCode("");
        this.setProviderId("");
        this.setMerchantId("");
        this.setServiceId("");
        this.setSendDT("");
        this.setChannelId("");
        this.setWalletId("");
        this.setDebitBankId("");
        this.setProcessedRecord(1);
        this.setDebitResourceNumber("");
        this.setCreditBankId("");
        this.setCreditType("");
        this.setCreditResourceNumber("");
        this.setRemittanceType("");
    }

    @Override
    public String toString() {
        return "{" +
                "clientMessageId=" + clientMessageId +
                ",transactionId=" + transactionId +
                ",orgCode=" + orgCode +
                ",providerId=" + providerId +
                ",merchantId=" + merchantId +
                ",serviceId=" + serviceId +
                ",sendDT=" + sendDT +
                ",channelId=" + channelId +
                ",walletId=" + walletId +
                ",debitBankId=" + debitBankId +
                ",processedRecord=" + processedRecord +
                ",debitResourceNumber=" + debitResourceNumber +
                ",creditBankId=" + creditBankId +
                ",creditType=" + creditType +
                ",creditResourceNumber=" + creditResourceNumber +
                ",remittanceType=" + remittanceType +
                "}";
    }

    //    @SuppressWarnings("static-access")
//    public String toString(){
//        return new ToStringBuilder(this).reflectionToString (this, ToStringStyle.JSON_STYLE);
//    }
}

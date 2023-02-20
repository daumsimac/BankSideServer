package com.example.bank_side_server.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FirmInqBeneRepLayer {

    private String clientMessageId;
    private String transactionId;
    private String orgCode;
    private String providerId;
    private String merchantId;
    private String serviceId;
    private String businessErrorCode;
    private String businessErrorDesc;
    private Integer processedRecord;
    private String creditBankId;
    private String creditName;
    private Integer status;

    public FirmInqBeneRepLayer() {
        init();
    }

    private void init(){
        this.setClientMessageId("");
        this.setTransactionId("");
        this.setOrgCode("");
        this.setProviderId("");
        this.setMerchantId("");
        this.setServiceId("");
        this.setBusinessErrorCode("");
        this.setBusinessErrorDesc("");
        this.setProcessedRecord(1);
        this.setCreditBankId("");
        this.setCreditName("");
    }

    @SuppressWarnings("static-access")
    public String toString(){
        return new ToStringBuilder(this).reflectionToString (this, ToStringStyle.JSON_STYLE);
    }
}

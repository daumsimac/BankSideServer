package com.example.bank_side_server.model;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.List;

@Getter
@Setter
public class FundTransRepLayout {

    private String clientMessageId;
    private String providerId;
    private String orgCode;
    private String merchantId;
    private String serviceId;
    private String transStatus;
    private String httpError;
    private String businessErrorCode;
    private String businessErrorDesc;
    private String addInfo;
    private String responseTxnCode;
    private String processedRecord;
    private int status;
    private List<FundTransTrInfoRepLayout> tr_infos;

    @SuppressWarnings("static-access")
    public String toString(){
        return new ToStringBuilder(this).reflectionToString (this, ToStringStyle.JSON_STYLE);
    }
}

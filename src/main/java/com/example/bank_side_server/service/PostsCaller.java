package com.example.bank_side_server.service;

import com.example.bank_side_server.model.FirmInqBeneRepLayer;
import com.example.bank_side_server.model.FundTransRepLayout;
import retrofit2.http.Header;

public interface PostsCaller {
//    FirmInqBeneRepLayer getBeneficiary(@Header("content-type") String contentType, String body);
    FirmInqBeneRepLayer getBeneficiary(@Header("content-type") String contentType, String body);
    FundTransRepLayout getFundTransfer(@Header("content-type") String contentType, String body);
}

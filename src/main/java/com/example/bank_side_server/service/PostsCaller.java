package com.example.bank_side_server.service;

import com.example.bank_side_server.model.FirmInqBeneRepLayer;
import retrofit2.http.Header;

public interface PostsCaller {
//    FirmInqBeneRepLayer getBeneficiary(@Header("content-type") String contentType, String body);
    FirmInqBeneRepLayer getBeneficiary(@Header("content-type") String contentType, String body);
}

package com.example.bank_side_server.service;

import com.example.bank_side_server.model.FirmInqBeneRepLayer;
import com.example.bank_side_server.model.FirmInqBeneReqLayer;

public interface BankSideService {

    /**
     * 예금주조회 - 베트남
     *
     * @param req
     * @return
     * @throws Exception
     */
    public FirmInqBeneRepLayer execInquireBeneficiary(FirmInqBeneReqLayer req) throws Exception;

}

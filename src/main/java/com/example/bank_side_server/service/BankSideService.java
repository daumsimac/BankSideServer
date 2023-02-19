package com.example.bank_side_server.service;

import com.example.bank_side_server.model.FirmInqBeneRepLayer;
import com.example.bank_side_server.model.FirmInqBeneReqLayer;
import com.example.bank_side_server.model.FundTransRepLayout;
import com.example.bank_side_server.model.FundTransReqLayout;

public interface BankSideService {

    /**
     * 예금주조회 - 베트남
     *
     * @param req
     * @return
     * @throws Exception
     */
    public FirmInqBeneRepLayer execInquireBeneficiary(FirmInqBeneReqLayer req) throws Exception;

    /**
     * 송금 - 베트남
     *
     * @param req
     * @return
     * @throws Exception
     */
    public FundTransRepLayout execFundTransfer(FundTransReqLayout req) throws Exception;

}

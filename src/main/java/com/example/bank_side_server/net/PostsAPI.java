package com.example.bank_side_server.net;

import com.example.bank_side_server.model.FirmInqBeneRepLayer;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface PostsAPI {

    @POST("/mapper/v1/inquireBeneficiary")
    Call<FirmInqBeneRepLayer> getBeneficiary(@Header("content-type")String contentType , @Body String body);

    @POST("/mapper/v1/fundTransfer")
    Call<FirmInqBeneRepLayer> getFundTransfer(@Body String body);

    @POST("/mapper/v1/investigate")
    Call<FirmInqBeneRepLayer> getInvestigate(@Body String body);

    @POST("/mapper/v1/requestOTP")
    Call<FirmInqBeneRepLayer> getRequestOTP(@Body String body);

    @POST("/mapper/v1/convertCardNumberToId")
    Call<FirmInqBeneRepLayer> getConvertCardNumberToId(@Body String body);

    @POST("/mapper/v1/getBankList")
    Call<FirmInqBeneRepLayer> getBankList(@Body String body);

    @POST("/mapper/v1/getToken")
    Call<FirmInqBeneRepLayer> getToken(@Body String body);

    @POST("/mapper/v1/walletLink")
    Call<FirmInqBeneRepLayer> getWalletLink(@Body String body);

    @POST("/mapper/v1/walletInformation")
    Call<FirmInqBeneRepLayer> getWalletInformation(@Body String body);

    @POST("/mapper/v1/cancelConnection")
    Call<FirmInqBeneRepLayer> getCancelConnection(@Body String body);

    @POST("/mapper/v1/cashOut")
    Call<FirmInqBeneRepLayer> getCashOut(@Body String body);

    @POST("/mapper/v1/cashIn")
    Call<FirmInqBeneRepLayer> getCashIn(@Body String body);

    @POST("/mapper/v1/inquiryBalance")
    Call<FirmInqBeneRepLayer> getInquiryBalance(@Body String body);

    @POST("/mapper/v1/payment")
    Call<FirmInqBeneRepLayer> getPayment(@Body String body);

    @POST("/mapper/v1/refundForOriginalTransaction")
    Call<FirmInqBeneRepLayer> getRefundForOriginalTransaction(@Body String body);

    @POST("/mapper/v1/upgradeTransactionLimit")
    Call<FirmInqBeneRepLayer> getUpgradeTransactionLimit(@Body String body);

    @POST("/mapper/v1/verifyWalletOwner")
    Call<FirmInqBeneRepLayer> getVerifyWalletOwner(@Body String body);

    @POST("/mapper/v1/verifyIdCard")
    Call<FirmInqBeneRepLayer> getVerifyIdCard(@Body String body);

    @POST("/mapper/v1/inquiryAccount")
    Call<FirmInqBeneRepLayer> getㅑnquiryAccount(@Body String body);

}

package com.example.bank_side_server.net;

import com.example.bank_side_server.model.FirmInqBeneRepLayer;
import com.example.bank_side_server.model.FundTransRepLayout;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface PostsAPI {

    @POST("/bidv/v1/inquireBeneficiary")
    Call<FirmInqBeneRepLayer> getBeneficiary(@Header("content-type")String contentType , @Body String body);

    @POST("/bidv/v1/fundTransfer")
    Call<FundTransRepLayout> getFundTransfer(@Header("content-type")String contentType , @Body String body);

    @POST("/bidv/v1/investigate")
    Call<?> getInvestigate(@Body String body);

    @POST("/bidv/v1/requestOTP")
    Call<?> getRequestOTP(@Body String body);

    @POST("/bidv/v1/convertCardNumberToId")
    Call<?> getConvertCardNumberToId(@Body String body);

    @POST("/bidv/v1/getBankList")
    Call<?> getBankList(@Body String body);

    @POST("/bidv/v1/getToken")
    Call<?> getToken(@Body String body);

    @POST("/bidv/v1/walletLink")
    Call<?> getWalletLink(@Body String body);

    @POST("/bidv/v1/walletInformation")
    Call<?> getWalletInformation(@Body String body);

    @POST("/bidv/v1/cancelConnection")
    Call<?> getCancelConnection(@Body String body);

    @POST("/bidv/v1/cashOut")
    Call<?> getCashOut(@Body String body);

    @POST("/bidv/v1/cashIn")
    Call<?> getCashIn(@Body String body);

    @POST("/bidv/v1/inquiryBalance")
    Call<?> getInquiryBalance(@Body String body);

    @POST("/bidv/v1/payment")
    Call<?> getPayment(@Body String body);

    @POST("/bidv/v1/refundForOriginalTransaction")
    Call<?> getRefundForOriginalTransaction(@Body String body);

    @POST("/bidv/v1/upgradeTransactionLimit")
    Call<?> getUpgradeTransactionLimit(@Body String body);

    @POST("/bidv/v1/verifyWalletOwner")
    Call<?> getVerifyWalletOwner(@Body String body);

    @POST("/bidv/v1/verifyIdCard")
    Call<?> getVerifyIdCard(@Body String body);

    @POST("/bidv/v1/inquiryAccount")
    Call<?> getInquiryAccount(@Body String body);

}

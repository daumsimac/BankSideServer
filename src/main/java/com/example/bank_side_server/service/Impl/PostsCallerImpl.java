package com.example.bank_side_server.service.Impl;

import com.example.bank_side_server.model.FirmInqBeneRepLayer;
import com.example.bank_side_server.model.FundTransRepLayout;
import com.example.bank_side_server.net.PostsAPI;
import com.example.bank_side_server.service.PostsCaller;
import com.example.bank_side_server.util.RetrofitUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import retrofit2.Call;
import retrofit2.http.Header;

@RequiredArgsConstructor
@Component
public class PostsCallerImpl implements PostsCaller {

    @Autowired
    private RetrofitUtils retrofitUtils;
    @Autowired
    private final PostsAPI postsAPI;

    @Override
    public FirmInqBeneRepLayer getBeneficiary(@Header("content-type") String contentType, String body) {
        Call<FirmInqBeneRepLayer> call = postsAPI.getBeneficiary(contentType, body);
        return retrofitUtils.execute(call);
    }

    @Override
    public FundTransRepLayout getFundTransfer(@Header("content-type") String contentType, String body) {
        System.out.println(body.toString());
        Call<FundTransRepLayout> call = postsAPI.getFundTransfer(contentType, body);
        return retrofitUtils.execute(call);
    }

    //    @Override
//    public void getBeneficiary(@Header("content-type") String contentType, String body) {
//        System.out.println(contentType + " : " + body);;
//    }

}

package com.example.bank_side_server.config;

import com.example.bank_side_server.net.PostsAPI;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import okhttp3.ConnectionPool;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.concurrent.TimeUnit;

@Configuration
public class MapperRegistry {

    @Value("${bank.port}")
    private int port;

    @Value("${bank.ip}")
    private String ip;

    private final String baseUrl = "http://localhost:12000";

    private static final HttpLoggingInterceptor loggingIntercepter
            = new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY);

    private final Gson gson = new GsonBuilder()
            .setLenient()
            .create();

    @Bean
    PostsAPI getJsonPlaceHolderAPI(){
        ConnectionPool connectionPool = new ConnectionPool(5, 5L, TimeUnit.MINUTES);
        //retrofit 상세 설정
        OkHttpClient client = new OkHttpClient.Builder().connectionPool(connectionPool)
                //서버로 요청하는데 걸리는 시간을 제한 (20초 이내에 서버에 요청이 성공해야 한다. (handshakre))
                .connectTimeout(20, TimeUnit.SECONDS)
                //서버로 요청을 성공했고, 응답데이터를 받는데 시간을 제한한다.(15초 이내로 응답 데이터를 받아야한다.)
                .addInterceptor(loggingIntercepter)
                .build();

        return new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .client(client)
                .build()
                .create(PostsAPI.class);
    }

}

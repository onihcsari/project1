package com.example.project1;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface KakaoMapApi {
    @GET("/v2/local/search/keyword.json")
    Call<SearchResult> searchPlace(@Header("Authorization") String authHeader,
                                   @Query("query") String query);

}
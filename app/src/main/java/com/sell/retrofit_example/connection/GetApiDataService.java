package com.sell.retrofit_example.connection;

import com.sell.retrofit_example.models.SingleCateApiResponse;
import com.sell.retrofit_example.utils.Constants;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;


public interface GetApiDataService {

    /*get balance*/
    @FormUrlEncoded
    @POST("api/single_cate_product")
    Call<SingleCateApiResponse> callSingleCat(@Field(Constants.list) String list);

}

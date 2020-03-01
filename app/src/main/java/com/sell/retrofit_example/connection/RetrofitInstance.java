package com.sell.retrofit_example.connection;

import com.sell.retrofit_example.utils.Constants;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {

     private static Retrofit retrofit;

     /**
     * Create an instance of Retrofit object
     * */
  public static Retrofit getRetrofitInstance() {

      if (retrofit == null) {
            retrofit = new retrofit2.Retrofit.Builder()
                    .baseUrl(Constants.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
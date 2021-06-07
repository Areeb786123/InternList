package com.areeb.internlist.Network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroInstance {

    //public static String BASE_URL = "https://script.google.com/";


    private  static  Retrofit retrofit = null;

   public  static Retrofit getClient(String baseURL){
       if (retrofit == null){
            retrofit= new Retrofit.Builder()
                    .baseUrl(baseURL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
       }
       return  retrofit;
   }



}

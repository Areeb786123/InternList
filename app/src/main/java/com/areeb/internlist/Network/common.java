package com.areeb.internlist.Network;

public class common {

    private static  String BASE_URL= "https://script.google.com/macros/";

    public static apiService getStudents(){
        return  RetroInstance.getClient(BASE_URL).create(apiService.class);
    }
}

package com.areeb.internlist.Network;

import com.areeb.internlist.Model.Students;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface apiService {

    @GET("s/AKfycbzcdrLfFHSQVJafGteOpFPUvOp7LdLNPJVLKWxaP-COvRDD70pmqaTP2u3QNgXHNyZd/exec")

    Call<List<Students>> getStudentList();
}

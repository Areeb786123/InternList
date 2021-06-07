package com.areeb.internlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.areeb.internlist.Model.Students;
import com.areeb.internlist.Network.apiService;
import com.areeb.internlist.Network.common;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    RecyclerView student_recycle;
    apiService studentService;
    RecyclerView.LayoutManager StudentLayoutManager;
    Adapter studentAdapter;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        student_recycle= findViewById(R.id.list_reycler);

        studentService= common.getStudents();
        student_recycle.setAdapter(studentAdapter);
        student_recycle.setHasFixedSize(true);
        StudentLayoutManager= new LinearLayoutManager(this);
        student_recycle.setLayoutManager(StudentLayoutManager);


        getStudentDetails();



    }

    private void getStudentDetails() {

        studentService.getStudentList().enqueue(new Callback<List<Students>>() {
            @Override
            public void onResponse(Call<List<Students>> call, Response<List<Students>> response) {
                studentAdapter= new Adapter(getBaseContext(),response.body());
                studentAdapter .notifyDataSetChanged();
                student_recycle.setAdapter(studentAdapter);



            }

            @Override
            public void onFailure(Call<List<Students>> call, Throwable t) {

            }
        });
    }}

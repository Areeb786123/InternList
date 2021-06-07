package com.areeb.internlist.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Students {
    @SerializedName("Student_ID")
    @Expose

    private Integer Student_ID;

    @SerializedName("Name")
    @Expose

    private String Name;


    @SerializedName("Marks")
    @Expose
    private String Marks;

    public Integer getStudent_ID() {
        return Student_ID;
    }

    public void setStudent_ID(Integer student_ID) {
        Student_ID = student_ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getMarks() {
        return Marks;
    }

    public void setMarks(String marks) {
        Marks = marks;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public Students(Integer student_ID, String name, String marks, String status) {
        Student_ID = student_ID;
        Name = name;
        Marks = marks;
        Status = status;
    }

    @SerializedName("Status")
    @Expose
    private String Status;



}

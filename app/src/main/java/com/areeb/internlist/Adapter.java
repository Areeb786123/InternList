package com.areeb.internlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.areeb.internlist.Model.Students;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class Adapter  extends RecyclerView.Adapter<Adapter.StudentViewHolder>{

    private Context context;
    private List<Students> student_items;

    public Adapter(Context context, List<Students> student_items) {
        this.context = context;
        this.student_items = student_items;
    }

    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_layout,parent,false);
        return new StudentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull StudentViewHolder holder, int position) {
        Students items = student_items.get(position);
        holder.Name.setText(items.getName());
        holder.Student_ID.setText(Integer.toString(items.getStudent_ID()));
        holder.Marks.setText(items.getMarks());
        holder.Status.setText(items.getStatus());

    }

    @Override
    public int getItemCount() {
        return student_items.size();
    }

    public  static  class StudentViewHolder extends RecyclerView.ViewHolder{

        TextView Name ,Student_ID,Marks,Status;

        public StudentViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);

            Name = itemView.findViewById(R.id.Name);
            Student_ID= itemView.findViewById(R.id.Student_ID);
            Marks= itemView.findViewById(R.id.Marks);
            Status = itemView.findViewById(R.id.Status);
        }
    }
}

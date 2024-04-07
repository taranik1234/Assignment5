package com.example.kudaravalliv1_m5;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CourseViewer extends RecyclerView.Adapter<CourseViewer.ViewHolder> {

    private ArrayList<listpriority> courseModalArrayList;
    private Context context;

    public CourseViewer(ArrayList<listpriority> courseModalArrayList, Context context) {
        this.courseModalArrayList = courseModalArrayList;
        this.context = context;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView courseNameTV, courseDescTV, courseTracksTV;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            courseNameTV = itemView.findViewById(R.id.idTVCourseName);
            courseDescTV = itemView.findViewById(R.id.idTVCourseDescription);
            courseTracksTV = itemView.findViewById(R.id.idTVCourseTracks);
        }
    }
}

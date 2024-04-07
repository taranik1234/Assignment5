package com.example.kudaravalliv1_m5;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CourseList extends AppCompatActivity {

    private ArrayList<listpriority> priorityArrayList;
    private DBHandler dbHandler;
    private CourseViewer courseviewer;
    private RecyclerView courseList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courselist);

        priorityArrayList = new ArrayList<>();
        dbHandler = new DBHandler(CourseList.this);
        priorityArrayList = dbHandler.viewcourses();
        courseviewer = new CourseViewer(priorityArrayList, CourseList.this);
        courseList = findViewById(R.id.viewcourses);

    }
}
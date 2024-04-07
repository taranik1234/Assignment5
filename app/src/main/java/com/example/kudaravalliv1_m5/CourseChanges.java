package com.example.kudaravalliv1_m5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CourseChanges extends AppCompatActivity {

    private EditText course, description;
    private Button update, delete;
    private DBHandler dbHandler;
    String courseName, description1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);

        course = findViewById(R.id.coursename);
        description = findViewById(R.id.description);
        update = findViewById(R.id.update);
        delete = findViewById(R.id.delete);
        dbHandler = new DBHandler(CourseChanges.this);

        courseName = getIntent().getStringExtra("name");

        course.setText(courseName);
        description.setText(description1);

        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dbHandler.updateCourse(courseName, course.getText().toString(), description.getText().toString(),);

                Toast.makeText(CourseChanges.this, "Update successful", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(CourseChanges.this, MainActivity.class);
                startActivity(i);
            }
        });
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dbHandler.deleteCourse(courseName);
                Toast.makeText(CourseChanges.this, "Deletion successful", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(CourseChanges.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}
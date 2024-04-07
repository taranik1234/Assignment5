package com.example.kudaravalliv1_m5;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText coursename, name, prioritt, description;
    private Button add, view;
    private DBHandler dbHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        coursename = findViewById(R.id.coursename);
        name = findViewById(R.id.idEdtCourseTracks);
        prioritt = findViewById(R.id.duration);
        description = findViewById(R.id.description);
        add = findViewById(R.id.addcourse);
        view = findViewById(R.id.readcourse);
        dbHandler = new DBHandler(MainActivity.this);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String courseName = coursename.getText().toString();
                String studentName = name.getText().toString();
                String userPriority = prioritt.getText().toString();
                String studentDescription = description.getText().toString();

                if (courseName.isEmpty() || studentName.isEmpty() || userPriority.isEmpty() || studentDescription.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Empty fields not allowed", Toast.LENGTH_SHORT).show();
                    return;
                }

                dbHandler.addcourse(courseName, userPriority, studentDescription, studentName);
                Toast.makeText(MainActivity.this, "Succesful.", Toast.LENGTH_SHORT).show();
                coursename.setText("");
                prioritt.setText("");
                name.setText("");
                description.setText("");
            }
        });

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, CourseList.class);
                startActivity(i);
            }
        });
    }
}
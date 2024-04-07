package com.example.kudaravalliv1_m5;

public class listpriority {

    private String courseName;
    private String userPriority;
    private String studentName;
    private String studentDescription;
    private int id;


    public int getId() { return id; }

    public void setId(int id) { this.id = id; }
    public listpriority(String courseName,
                        String userPriority,
                        String studentName,
                        String studentDescription)
    {
        this.courseName = courseName;
        this.userPriority = userPriority;
        this.studentName = studentName;
        this.studentDescription = studentDescription;
    }
}


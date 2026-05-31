package com.example.studentlist;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    StudentAdapter adapter;
    ArrayList<StudentModel> studentList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        studentList = new ArrayList<>();

        studentList.add(new StudentModel(
                "Ali",
                "101",
                "Computer Science"));

        studentList.add(new StudentModel(
                "Ahmed",
                "102",
                "Software Engineering"));

        studentList.add(new StudentModel(
                "Sara",
                "103",
                "Information Technology"));

        studentList.add(new StudentModel(
                "Ayesha",
                "104",
                "Artificial Intelligence"));

        adapter = new StudentAdapter(studentList);

        recyclerView.setLayoutManager(
                new LinearLayoutManager(this));

        recyclerView.setAdapter(adapter);
    }
}

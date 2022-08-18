package com.example.cw6;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Student> studentArrayList=new ArrayList<>();
    int currentStudent=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView studentphotoView=findViewById(R.id.imageView);
        TextView textView=findViewById(R.id.textView3);
        TextView textView1=findViewById(R.id.textView);
        TextView textView2=findViewById(R.id.textView4);
        Button button=findViewById(R.id.button);
        Student student1=new Student("Retaj",17,12,R.drawable.retaj);
        Student student2=new Student("Youssef",14,12,R.drawable.youssef);
        Student student3=new Student("Majed",15,11,R.drawable.majed);
        Student student4=new Student("Salman",13,10,R.drawable.salman);

        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);
        studentArrayList.add(student4);

        studentphotoView.setImageResource(studentArrayList.get(currentStudent).getStudentImg());
        textView.setText(studentArrayList.get(currentStudent).getStudentName());
        textView1.setText(String.valueOf(studentArrayList.get(currentStudent).getStudentAge()));
        textView2.setText(String.valueOf(studentArrayList.get(currentStudent).getStudentGrade()));

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentStudent++;
                studentphotoView.setImageResource(studentArrayList.get(currentStudent).getStudentImg());
                textView.setText(studentArrayList.get(currentStudent).getStudentName());
                textView1.setText(String.valueOf(studentArrayList.get(currentStudent).getStudentAge()));
                textView2.setText(String.valueOf(studentArrayList.get(currentStudent).getStudentGrade()));


            }
        });

    }

}

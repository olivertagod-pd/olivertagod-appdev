package com.example.login_and_cv;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_cv);

        // Find views by id
        TextView title = findViewById(R.id.title);
        TextView name = findViewById(R.id.name);
        TextView address = findViewById(R.id.address);
        TextView phone = findViewById(R.id.phone);
        TextView email = findViewById(R.id.email);
        TextView skills = findViewById(R.id.skills);
        TextView skills_list = findViewById(R.id.skills_list);
        TextView education = findViewById(R.id.education);
        TextView course = findViewById(R.id.course);
        TextView university = findViewById(R.id.university);
        TextView experience = findViewById(R.id.experience);
        TextView job = findViewById(R.id.job);
        TextView job_address = findViewById(R.id.job_address);
        TextView job_desc = findViewById(R.id.job_desc);

        // Set text to the TextViews
        title.setText("Simple CV");
        name.setText("\nOliver Gablino Tagod");
        address.setText("Valencia, Ormoc City, Leyte, PH");
        phone.setText("09274386334");
        email.setText("oliverberrgablinotagod@gmail.com");
        skills.setText("Skills");
        skills_list.setText("Python (Tkinter)\nSQL\nPandas, NumPy, and Matplotlib\nData Analytics\nFamiliar with Machine and Deep Learning");
        education.setText("Education");
        course.setText("\nBachelor of Science in Information Technology");
        university.setText("EVSU - Ormoc Campus, Present");
        experience.setText("Experience");
        job.setText("\nWeb Content Writer");
        job_address.setText("Bootyard, 2020-2020");
        job_desc.setText("• I'm an intern on this company. My task is to keep on SEO trends and increase product engagement.");
    }
}

package com.example.resumebuilder;

import static com.example.resumebuilder.Data_1.email;
import static com.example.resumebuilder.Data_1.mobile;
import static com.example.resumebuilder.Data_2.linkedin;
import static com.example.resumebuilder.Data_2.twitter;
import static com.example.resumebuilder.Data_3.course;
import static com.example.resumebuilder.Data_3.degree;
import static com.example.resumebuilder.Data_3.english;
import static com.example.resumebuilder.Data_3.gujarati;
import static com.example.resumebuilder.Data_3.hindi;
import static com.example.resumebuilder.Data_3.passing;
import static com.example.resumebuilder.Data_3.university;
import static com.example.resumebuilder.Data_4.company;
import static com.example.resumebuilder.Data_4.ending;
import static com.example.resumebuilder.Data_4.leadership;
import static com.example.resumebuilder.Data_4.position1;
import static com.example.resumebuilder.Data_4.responsibility;
import static com.example.resumebuilder.Data_4.solve;
import static com.example.resumebuilder.Data_4.starting;
import static com.example.resumebuilder.Data_4.teamwork;
import static com.example.resumebuilder.Details.name12;
import static com.example.resumebuilder.Details.work1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class resume_2 extends AppCompatActivity {
    TextView name_txt, working_txt, email_txt, mobile_txt, linkedin_txt, twitter_txt, university_txt, degree_txt, graduation_txt, course_txt, english_txt, hindi_txt, gujarati_txt, company_txt, position_txt, starting_txt, ending_txt, teamwork_txt, responsibility_txt, solve_txt, leadership_txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resume2);
        binding();
        name_txt.setText(name12);
        working_txt.setText(work1);
        email_txt.setText(email);
        mobile_txt.setText(mobile);
        linkedin_txt.setText(linkedin);
        twitter_txt.setText(twitter);
        university_txt.setText(university);
        degree_txt.setText(degree);
        graduation_txt.setText(passing);
        course_txt.setText(course);
        hindi_txt.setText(hindi);
        english_txt.setText(english);
        gujarati_txt.setText(gujarati);
        position_txt.setText(position1);
        company_txt.setText(company);
        starting_txt.setText(starting);
        ending_txt.setText(ending);
        teamwork_txt.setText(teamwork);
        responsibility_txt.setText(responsibility);
        solve_txt.setText(solve);
        leadership_txt.setText(leadership);


    }

    void binding() {
        name_txt = findViewById(R.id.name_txt);
        working_txt = findViewById(R.id.working_txt);
        email_txt = findViewById(R.id.email_txt);
        mobile_txt = findViewById(R.id.mobile_txt);
        linkedin_txt = findViewById(R.id.linkedin_txt);
        twitter_txt = findViewById(R.id.twitter_txt);
        university_txt = findViewById(R.id.university_txt);
        degree_txt = findViewById(R.id.degree_txt);
        graduation_txt = findViewById(R.id.graduation_txt);
        course_txt = findViewById(R.id.course_txt);
        gujarati_txt = findViewById(R.id.gujarati_txt);
        english_txt = findViewById(R.id.english_txt);
        hindi_txt = findViewById(R.id.hindi_txt);
        position_txt = findViewById(R.id.position_txt);
        company_txt = findViewById(R.id.company_txt);
        starting_txt = findViewById(R.id.starting_txt);
        ending_txt = findViewById(R.id.ending_txt);
        teamwork_txt = findViewById(R.id.teamwork_txt);
        solve_txt = findViewById(R.id.solve_txt);
        responsibility_txt = findViewById(R.id.responsibility_txt);
        leadership_txt = findViewById(R.id.leadership_txt);

    }

}

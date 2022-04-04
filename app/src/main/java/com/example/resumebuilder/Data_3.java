package com.example.resumebuilder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Data_3 extends AppCompatActivity {
    Button next3_btn;
    TextView basic_btn, contact_btn, experience2_btn, document_btn, course_edt;
    EditText degree_edt, university_edt, passing_edt,percent_edt;
    ImageView back_btn;
    CheckBox English_box, Hindi_box, Gujarati_box;
    public static String degree, university, passing, course, english, gujarati, hindi,percent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data3);
        binding();
        next3_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                degree = degree_edt.getText().toString();
                university = university_edt.getText().toString();
                passing = passing_edt.getText().toString();
                course = course_edt.getText().toString();
                percent=percent_edt.getText().toString();
                if (degree_edt.getText().length() == 0) {
                    degree_edt.setError("Graduation Details");
                } else if (university_edt.getText().length() == 0) {
                    university_edt.setError("University Name");
                } else if (percent_edt.getText().length() == 0) {
                    percent_edt.setError("Percentage");
                } else if (passing_edt.getText().length() == 0) {
                    passing_edt.setError("Year");
                }
                else {
                    Intent intent = new Intent(Data_3.this, Data_4.class);
                    startActivity(intent);
                }
            }
        });
        English_box.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b == true) {
                    english = "English    : Intermediate";
                } else {
                    english = "English : No";
                }
            }
        });
        Hindi_box.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b == true) {
                    hindi = "Hindi        : High";
                } else {
                    hindi = "Hindi : No";
                }
            }
        });
        Gujarati_box.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b == true) {
                    gujarati = "Gujarati   : High";
                } else {
                    gujarati = "Gujarati : No";
                }
            }
        });
        basic_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Data_3.this, Data_1.class);
                startActivity(intent);
            }
        });
        contact_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Data_3.this, Data_2.class);
                startActivity(intent);
            }
        });
        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Data_3.this, Details.class);
                startActivity(intent);
            }
        });
        experience2_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Data_3.this, Data_4.class);
                startActivity(intent);
            }
        });
        document_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Data_3.this, Data_5.class);
                startActivity(intent);
            }
        });
    }

    void binding() {
        next3_btn = findViewById(R.id.next3_btn);
        basic_btn = findViewById(R.id.basic_btn);
        contact_btn = findViewById(R.id.contact_btn);
        back_btn = findViewById(R.id.back_btn);
        experience2_btn = findViewById(R.id.experience2_btn);
        document_btn = findViewById(R.id.document_btn);
        university_edt = findViewById(R.id.university_edt);
        degree_edt = findViewById(R.id.degree_edt);
        passing_edt = findViewById(R.id.passing_edt);
        course_edt = findViewById(R.id.course_edt);
        English_box = findViewById(R.id.English_box);
        Hindi_box = findViewById(R.id.Hindi_box);
        Gujarati_box = findViewById(R.id.Gujarati_box);
        percent_edt=findViewById(R.id.percent_edt);

    }

}
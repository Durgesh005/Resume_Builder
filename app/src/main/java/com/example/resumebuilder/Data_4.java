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

public class Data_4 extends AppCompatActivity {
    TextView basic_btn, contact2_btn, education_btn, documents_btn;
    EditText position_edt, company_edt, starting_edt, ending2_edt, other2_edt, hobby1_edt, hobby2_edt;
    ImageView back_btn;
    Button next4_btn;
    CheckBox teamwork_box, solve_box, responsibility_box, leadership_box;
    public static String position1, company, starting, ending, other2, teamwork, responsibility, solve, leadership,hobby1,hobby2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data4);
        binding();
        next4_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                position1 = position_edt.getText().toString();
                company = company_edt.getText().toString();
                starting = starting_edt.getText().toString();
                ending = ending2_edt.getText().toString();
                other2 = other2_edt.getText().toString();
                hobby1=hobby1_edt.getText().toString();
                hobby2=hobby2_edt.getText().toString();
                if (position_edt.getText().length() == 0) {
                    position_edt.setError("Current Post");
                } else if (company_edt.getText().length() == 0) {
                    company_edt.setError("Company");
                } else if (starting_edt.getText().length() == 0) {
                    starting_edt.setError("Date");
                }
                else if (hobby1_edt.getText().length() == 0) {
                    hobby1_edt.setError("Hobby");
                }
                else if (hobby2_edt.getText().length() == 0) {
                    hobby2_edt.setError("Hobby");
                } else {
                    Intent intent = new Intent(Data_4.this, Data_5.class);
                    startActivity(intent);
                }
            }
        });
        teamwork_box.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b == true) {
                    teamwork = "Teamwork              : High";
                } else {
                    teamwork = "Teamwork      : No";
                }

            }
        });

        solve_box.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b == true) {
                    solve = "Problem Solving    : Intermediate";
                } else {
                    solve = "Problem Solving : No";
                }
            }
        });
        responsibility_box.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b == true) {
                    responsibility = "Responsibility        : High";
                } else {
                    responsibility = "Responsibility : No";
                }
            }
        });
        leadership_box.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b == true) {
                    leadership = "Leadership             : Learning";
                } else {
                    leadership = "Leadership     : No";
                }
            }
        });

        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Data_4.this, Details.class);
                startActivity(intent);
            }
        });
        contact2_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Data_4.this, Data_2.class);
                startActivity(intent);
            }
        });
        basic_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Data_4.this, Data_1.class);
                startActivity(intent);
            }
        });
        education_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Data_4.this, Data_3.class);
                startActivity(intent);
            }
        });
        documents_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Data_4.this, Data_5.class);
                startActivity(intent);
            }
        });

    }

    void binding() {
        back_btn = findViewById(R.id.back_btn);
        basic_btn = findViewById(R.id.basic_btn);
        contact2_btn = findViewById(R.id.contact2_btn);
        education_btn = findViewById(R.id.education_btn);
        documents_btn = findViewById(R.id.documents_btn);
        next4_btn = findViewById(R.id.next4_btn);
        position_edt = findViewById(R.id.position_edt);
        company_edt = findViewById(R.id.company_edt);
        starting_edt = findViewById(R.id.starting_edt);
        ending2_edt = findViewById(R.id.ending2_edt);
        other2_edt = findViewById(R.id.other2_edt);
        teamwork_box = findViewById(R.id.teamwork_box);
        solve_box = findViewById(R.id.solve_box);
        responsibility_box = findViewById(R.id.responsibility_box);
        leadership_box = findViewById(R.id.leadership_box);
        hobby1_edt = findViewById(R.id.hobby1_edt);
        hobby2_edt = findViewById(R.id.hobby2_edt);
    }
}
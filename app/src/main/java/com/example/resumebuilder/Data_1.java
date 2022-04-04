package com.example.resumebuilder;

import static com.example.resumebuilder.Details.name12;
import static com.example.resumebuilder.Details.work1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Data_1 extends AppCompatActivity {
    Button next_btn;
    EditText email_edt, mobile_edt, city_edt, state_edt, country_edt, nation_edt;
    TextView user_txt, working_txt, contact2_btn, education_btn, experience_btn, documents_btn;
    ImageView back_btn;
    public static String email, mobile, city, state, country, nation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data1);
        binding();
        user_txt.setText(name12);
        working_txt.setText(work1);
        next_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                email = email_edt.getText().toString();
                mobile = mobile_edt.getText().toString();
                city = city_edt.getText().toString();
                state = state_edt.getText().toString();
                country = country_edt.getText().toString();
                nation = nation_edt.getText().toString();
                if (email_edt.getText().length() == 0) {
                    email_edt.setError("Email Id");
                } else if (mobile_edt.getText().length() == 0) {
                    mobile_edt.setError("Mobile Number");
                } else if (city_edt.getText().length() == 0) {
                    city_edt.setError("City");
                } else if (state_edt.getText().length() == 0) {
                    state_edt.setError("State");
                } else if (country_edt.getText().length() == 0) {
                    country_edt.setError("Country");
                } else if (nation_edt.getText().length() == 0) {
                    nation_edt.setError("Nationality");
                } else {
                    Intent intent = new Intent(Data_1.this, Data_2.class);
                    startActivity(intent);
                }
            }
        });

        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Data_1.this, Details.class);
                startActivity(intent);
            }
        });
        education_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Data_1.this, Data_3.class);
                startActivity(intent);
            }
        });
        contact2_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Data_1.this, Data_2.class);
                startActivity(intent);
            }
        });
        experience_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Data_1.this, Data_4.class);
                startActivity(intent);
            }
        });
        documents_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Data_1.this, Data_5.class);
                startActivity(intent);
            }
        });
    }

    void binding() {
        next_btn = findViewById(R.id.next_btn);
        email_edt = findViewById(R.id.email_edt);
        mobile_edt = findViewById(R.id.mobile_edt);
        city_edt = findViewById(R.id.city_edt);
        state_edt = findViewById(R.id.state_edt);
        country_edt = findViewById(R.id.country_edt);
        nation_edt = findViewById(R.id.nation_edt);
        user_txt = findViewById(R.id.user_txt);
        working_txt = findViewById(R.id.working_txt);
        contact2_btn = findViewById(R.id.contact2_btn);
        back_btn = findViewById(R.id.back_btn);
        education_btn = findViewById(R.id.education_btn);
        experience_btn = findViewById(R.id.experience_btn);
        documents_btn = findViewById(R.id.documents_btn);


    }
}
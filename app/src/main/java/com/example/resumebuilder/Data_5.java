package com.example.resumebuilder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Data_5 extends AppCompatActivity {
    TextView basic_btn, contact2_btn, education_btn, experience_btn;
    ImageView back_btn;
    Button submit_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data5);
        binding();
        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Data_5.this, Details.class);
                startActivity(intent);
            }
        });
        education_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Data_5.this, Data_3.class);
                startActivity(intent);
            }
        });
        contact2_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Data_5.this, Data_2.class);
                startActivity(intent);
            }
        });
        experience_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Data_5.this, Data_4.class);
                startActivity(intent);
            }
        });
        basic_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Data_5.this, Data_1.class);
                startActivity(intent);
            }
        });
        submit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Data_5.this,Templates.class);
                startActivity(intent);
            }
        });
    }

    void binding() {
        back_btn = findViewById(R.id.back_btn);
        basic_btn = findViewById(R.id.basic_btn);
        contact2_btn = findViewById(R.id.contact2_btn);
        education_btn = findViewById(R.id.education_btn);
        experience_btn = findViewById(R.id.experience_btn);
        submit_btn=findViewById(R.id.submit_btn);

    }

}
package com.example.resumebuilder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Templates extends AppCompatActivity {
    ImageView r4_btn,r2_btn,r1_btn,r3_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_templates);
        binding();

        r1_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Templates.this, resume_1.class);
                startActivity(intent);
            }

        });
        r3_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Templates.this, resume_4.class);
                startActivity(intent);
            }

        });
        r4_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Templates.this, resume_3.class);
                startActivity(intent);
            }

        });
        r2_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Templates.this, resume_2.class);
                startActivity(intent);
            }

        });

    }

    void binding() {
        r4_btn = findViewById(R.id.r4_btn);
        r2_btn=findViewById(R.id.r2_btn);
        r1_btn = findViewById(R.id.r1_btn);
        r3_btn=findViewById(R.id.r3_btn);

    }

}
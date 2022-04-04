package com.example.resumebuilder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Data_2 extends AppCompatActivity {
    Button next2_btn;
    TextView basic_btn, education_btn, experience2_btn, document_btn;
    ImageView back_btn;
    EditText linkedin_edt, twitter_edt;
    public static String linkedin, twitter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data2);
        binding();
        next2_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                linkedin = linkedin_edt.getText().toString();
                twitter = twitter_edt.getText().toString();
                if (linkedin_edt.getText().length() == 0) {
                    linkedin_edt.setError("Link");
                } else if (twitter_edt.getText().length() == 0) {
                    twitter_edt.setError("Link");
                } else {
                    Intent intent = new Intent(Data_2.this, Data_3.class);
                    startActivity(intent);
                }
            }
        });
        basic_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Data_2.this, Data_1.class);
                startActivity(intent);
            }
        });
        education_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Data_2.this, Data_3.class);
                startActivity(intent);
            }
        });
        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Data_2.this, Details.class);
                startActivity(intent);
            }
        });

        document_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Data_2.this, Data_5.class);
                startActivity(intent);
            }
        });
        experience2_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Data_2.this, Data_4.class);
                startActivity(intent);
            }
        });

    }

    void binding() {
        basic_btn = findViewById(R.id.basic_btn);
        back_btn = findViewById(R.id.back_btn);
        education_btn = findViewById(R.id.education_btn);
        next2_btn = findViewById(R.id.next2_btn);
        experience2_btn = findViewById(R.id.experience2_btn);
        document_btn = findViewById(R.id.document_btn);
        linkedin_edt = findViewById(R.id.linkedin_edt);
        twitter_edt = findViewById(R.id.twitter_edt);

    }

}
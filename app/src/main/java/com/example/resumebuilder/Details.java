package com.example.resumebuilder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Details extends AppCompatActivity {
    Button next_btn;
    EditText name_edt, work_edt, email_edt, mobile_edt, city_edt, state_edt;
    public static String name12, work1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        binding();


        next_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name12 = name_edt.getText().toString();
                work1 = work_edt.getText().toString();
                if (name_edt.getText().length() == 0) {
                    name_edt.setError("Enter the Name");
                } else if (work_edt.getText().length() == 0) {
                    work_edt.setError("Work Profile");
                } else {
                    Intent intent = new Intent(Details.this, Data_1.class);
                    startActivity(intent);
                }
            }
        });
    }

    void binding() {
        next_btn = findViewById(R.id.next_btn);
        name_edt = findViewById(R.id.name_edt);
        work_edt = findViewById(R.id.work_edt);


    }
}
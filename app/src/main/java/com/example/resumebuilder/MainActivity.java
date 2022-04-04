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
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Button;
import android.widget.Toast;

import com.example.resumebuilder.Details;

public class MainActivity extends AppCompatActivity {
    //ImageView create_btn;
    Button create2_btn,view_btn,download_btn,feedbacks_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding();
        create2_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, Details.class);
                startActivity(intent);
            }

        });
        view_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"View Resume...",Toast.LENGTH_SHORT).show();

            }
        });
        download_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Downloadi" +
                        "ng...",Toast.LENGTH_SHORT).show();

            }
        });
        feedbacks_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Feedbacks..",Toast.LENGTH_SHORT).show();

            }
        });



    }

    void binding() {

        create2_btn=findViewById(R.id.create2_btn);
        view_btn=findViewById(R.id.view_btn);
        download_btn=findViewById(R.id.download_btn);
        feedbacks_btn=findViewById(R.id.feedback_btn);
    }

}
package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {
    private EditText edittext_maths, edittext_art, edittext_science, edittext_lo;
    private TextView text_results;
    private Button btn_back, btn_calculate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        btn_back = findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(CalculatorActivity.this, MenuActivity.class);
                startActivity(intent);
            }
        });


        btn_calculate = findViewById(R.id.btn_calculate);
        btn_calculate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                edittext_maths = findViewById(R.id.edittext_maths);
                double maths_mark = Double.parseDouble( edittext_maths.getText().toString() );

                edittext_art = findViewById(R.id.edittext_art);
                double art_mark = Double.parseDouble( edittext_art.getText().toString() );

                edittext_science = findViewById(R.id.edittext_science);
                double science_mark = Double.parseDouble( edittext_science.getText().toString() );

                edittext_lo = findViewById(R.id.edittext_lo);
                double lo_mark = Double.parseDouble( edittext_lo.getText().toString() );

                double average_mark = (maths_mark + art_mark + science_mark + lo_mark) / 4;

                text_results = findViewById(R.id.text_results);
                text_results.setText("Your mark average is: \n" + average_mark);

            }
        });


    }
}
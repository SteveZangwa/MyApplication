package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText edittext_visitor_name;
    private Button btn_next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edittext_visitor_name = findViewById(R.id.edittext_visitor_name);
        btn_next = findViewById(R.id.btn_next);



        btn_next.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                String textmessage = edittext_visitor_name.getText().toString();

                Intent intent = new Intent( MainActivity.this, MenuActivity.class);
                intent.putExtra("visitors_name", textmessage);
                startActivity(intent);
            }
        });

    }


}
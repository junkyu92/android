package com.mega.test05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {
    Button b04;
    EditText et04;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        setTitle("goTrip");
        b04 = findViewById(R.id.b04);
        et04 = findViewById(R.id.et04);
        b04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String place = et04.getText().toString();
                Toast.makeText(getApplicationContext(), place + "를 선택했습니다.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
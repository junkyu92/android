package com.mega.test05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    Button b01, b02;
    EditText et01, et02;
    int result;
    TextView tv01;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("초간단 계산기");
        b01 = findViewById(R.id.b01);
        b02 = findViewById(R.id.b02);
        et01 = findViewById(R.id.et01);
        tv01 = findViewById(R.id.tv01);
        et02 = findViewById(R.id.et02);

        b01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "더한 결과::" + result, Toast.LENGTH_LONG).show();
            }
        });
        b02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result = Integer.parseInt(et01.getText().toString()) + Integer.parseInt(et02.getText().toString());
                tv01.setText(""+result);
            }
        });
    }
}
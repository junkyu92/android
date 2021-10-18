package com.mega.test05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Switch;

public class MainActivity7 extends AppCompatActivity {
    Button b07, b08;
    Switch switch07;
    LinearLayout lay01, lay02, lay03;
    CheckBox checkBox;
    RadioButton rb01,rb02,rb03;
    ImageView iv07;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        b07 = findViewById(R.id.b07);
        b08 = findViewById(R.id.b08);
        switch07 = findViewById(R.id.switch07);
        lay01 = findViewById(R.id.lay01);
        lay02 = findViewById(R.id.lay02);
        lay03 = findViewById(R.id.lay03);
        checkBox = findViewById(R.id.checkBox);
        rb01 = findViewById(R.id.rb01);
        rb02 = findViewById(R.id.rb02);
        rb03 = findViewById(R.id.rb03);
        iv07 = findViewById(R.id.iv07);
        lay01.setVisibility(View.INVISIBLE);
        lay02.setVisibility(View.INVISIBLE);
        lay03.setVisibility(View.INVISIBLE);
        switch07.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    lay01.setVisibility(View.VISIBLE);
                }else {
                    lay01.setVisibility(View.INVISIBLE);
                }
            }
        });

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    lay02.setVisibility(View.VISIBLE);
                }else {
                    lay02.setVisibility(View.INVISIBLE);
                }
            }
        });

        b08.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (rb01.isChecked()){
                    iv07.setImageResource(R.drawable.dog);
                }else if (rb02.isChecked()){
                    iv07.setImageResource(R.drawable.cat);
                }else if (rb03.isChecked()){
                    iv07.setImageResource(R.drawable.rabbit);
                }
                lay03.setVisibility(View.VISIBLE);
            }
        });
        b07.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.naver.com"));
                startActivity(intent);
            }
        });
    }
}
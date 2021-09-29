package com.mega.mobile05;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    EditText in1;
    Button b01,b02,b03;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        in1 = findViewById(R.id.in1);
        b01 = findViewById(R.id.b01);
        b02 = findViewById(R.id.b02);
        b03 = findViewById(R.id.b03);
        b01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String in2 = in1.getText().toString();
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(in2));
                startActivity(intent);
            }
        });
        b02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity2.this);
                dlg.setTitle("맛집을 골라주세요.");
                String[] list = {"다성대게킹크랩", "소문난집", "진돈부리"};
                dlg.setItems(list, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        String in3 = "";
                        if(i==0){
                            in3 = "https://map.naver.com/v5/search/%EC%8B%A0%EC%B4%8C%EB%A7%9B%EC%A7%91/place/11622838?c=14130079.6439651,4516777.2957075,15,0,0,0,dh&placePath=%3Fentry%253Dbmp%2526from%253DPLACE_AD";
                        }else if (i==1){
                            in3 = "https://map.naver.com/v5/search/%EC%8B%A0%EC%B4%8C%EB%A7%9B%EC%A7%91/place/11622838?c=14130079.6439651,4516777.2957075,15,0,0,0,dh&placePath=%3Fentry%253Dbmp%2526from%253DPLACE_AD";
                        }else if (i==2){
                            in3 = "https://map.naver.com/v5/search/%EC%8B%A0%EC%B4%8C%EB%A7%9B%EC%A7%91/place/1674726200?c=14130079.6439651,4516777.2957075,15,0,0,0,dh&placePath=%3Fentry%253Dbmp";
                        }
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(in3));
                    startActivity(intent);
                    }
                });
                dlg.show();
            }
        });
        b03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
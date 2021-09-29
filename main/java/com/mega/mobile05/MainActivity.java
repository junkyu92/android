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
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1, b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("", "버튼1을 클릭했음.");
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("확인을 꼭 해주세요.!!");
                dlg.setIcon(R.mipmap.ic_launcher);
                //dlg.setMessage("버튼을 눌렀기 때문에 내가 떴어요!!!!");
                String[] versionArray = new String[]{"오레오", "파이", "큐"};
                dlg.setItems(versionArray, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                            Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.naver.com/search.naver?where=kin&sm=tab_jum&query=" + versionArray[i]));
                            startActivity(intent1);
                    }
                });
                dlg.setPositiveButton("확인", null);
                dlg.show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("", "버튼2을 클릭했음.");
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("확인을 꼭 해주세요.!!");
                dlg.setIcon(R.mipmap.ic_launcher);
                String[] versionArray = new String[]{"네이버", "구글", "다음"};
                dlg.setItems(versionArray, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if(i==0) {
                            Toast.makeText(getApplicationContext(), "네이버로 이동합니다", Toast.LENGTH_SHORT).show();
                            Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
                            startActivity(intent1);
                        }else if (i==1){
                            Toast.makeText(getApplicationContext(), "구글로 이동합니다", Toast.LENGTH_SHORT).show();
                            Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.google.com"));
                            startActivity(intent1);
                        }else if (i==2){
                            Toast.makeText(getApplicationContext(), "다음으로 이동합니다", Toast.LENGTH_SHORT).show();
                            Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.daum.net"));
                            startActivity(intent1);
                        }
                    }
                });
                dlg.setPositiveButton("확인", null);
                dlg.show();
            }
        });
    }
}
package com.app.mobile10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Map;

public class MainActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.pici_icon);
        setTitle("명화 선호도 투표");
        //투표수
        int[] voteCount = new  int[9];
        //이미지버튼 객체 저장할 공간
        ImageButton[] image = new ImageButton[9];
        //findViewById()
        int[] imageId = {R.id.ib1, R.id.ib2, R.id.ib3, R.id.ib4, R.id.ib5, R.id.ib6, R.id.ib7, R.id.ib8, R.id.ib9};
        String imgName[] = { "독서하는 소녀", "꽃장식 모자 소녀", "부채를 든 소녀",
                "이레느깡 단 베르양", "잠자는 소녀", "테라스의 두 자매", "피아노 레슨", "피아노 앞의 소녀들",
                "해변에서" };
        for (int i = 0; i < imageId.length; i++){
            final int i2 = i;
            image[i] = findViewById(imageId[i]);
            image[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    voteCount[i2]++;
                    Toast.makeText(getApplicationContext(), imgName[i2] + "의 득표수는 " + voteCount[i2] + "표", Toast.LENGTH_SHORT).show();
                }
            });
        }
        Button b1 = findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, ResultActivity.class);
                intent.putExtra("voteCount", voteCount);
                intent.putExtra("imgName", imgName);
                startActivity(intent);
            }
        });
    }
}
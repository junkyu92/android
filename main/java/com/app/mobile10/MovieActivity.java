package com.app.mobile10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MovieActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);
        String[] title = {"써니", "완득이", "괴물", "라디오스타", "비열한거리", "왕의남자", "아일랜드", "웰컴투동막골", "헬보이"};
        TextView[] tv = new TextView[title.length];
        ImageView[] iv = new ImageView[title.length];
        int[] srcId = {R.drawable.mov01, R.drawable.mov02, R.drawable.mov03, R.drawable.mov04, R.drawable.mov05, R.drawable.mov06, R.drawable.mov07, R.drawable.mov08, R.drawable.mov09};
        int[] tvId = {R.id.tv01, R.id.tv02, R.id.tv03, R.id.tv04, R.id.tv05, R.id.tv06, R.id.tv07, R.id.tv08, R.id.tv09};
        int[] ivId = {R.id.iv01, R.id.iv02, R.id.iv03, R.id.iv04, R.id.iv05, R.id.iv06, R.id.iv07, R.id.iv08, R.id.iv09};
        int[] count = new int[title.length];

        for (int i = 0; i < title.length; i++){
            final int i2 = i;
            tv[i] = findViewById(tvId[i]);
            iv[i] = findViewById(ivId[i]);
            tv[i].setText(title[i]);
            iv[i].setImageResource(srcId[i]);

            iv[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    count[i2]++;
                }
            });
        }
        Button b01 = findViewById(R.id.b01);
        b01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MovieActivity.this, MovieResult.class);
                intent.putExtra("title", title);
                intent.putExtra("srcId", srcId);
                intent.putExtra("count", count);
                startActivity(intent);
            }
        });

    }
}
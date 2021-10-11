package com.app.mobile10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MovieResult extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_result);
        Intent intent = getIntent();
        String[] title = intent.getStringArrayExtra("title");
        int[] srcId = intent.getIntArrayExtra("srcId");
        int[] count = intent.getIntArrayExtra("count");
        TextView[] tv = new TextView[title.length];
        ImageView[] iv = new ImageView[title.length];
        int[] tvId = {R.id.tv001, R.id.tv002, R.id.tv003, R.id.tv004, R.id.tv005, R.id.tv006, R.id.tv007, R.id.tv008, R.id.tv009};
        int[] ivId = {R.id.iv001, R.id.iv002, R.id.iv003, R.id.iv004, R.id.iv005, R.id.iv006, R.id.iv007, R.id.iv008, R.id.iv009};
        for (int i = 0; i < title.length; i++){
            final int i2 = i;
            tv[i] = findViewById(tvId[i]);
            iv[i] = findViewById(ivId[i]);
            tv[i].setText(title[i] + " : " + count[i] + "표");
            iv[i].setImageResource(srcId[i]);
        }
    }
}
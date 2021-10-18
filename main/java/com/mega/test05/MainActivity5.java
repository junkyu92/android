package com.mega.test05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TabHost;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        LinearLayout layout1 = findViewById(R.id.tab1);
        LinearLayout layout2 = findViewById(R.id.tab2);
        LinearLayout layout3 = findViewById(R.id.tab3);

        View view1 = View.inflate(this, R.layout.tab1, null);
        View view2 = View.inflate(this, R.layout.tab2, null);
        View view3 = View.inflate(this, R.layout.tab3, null);

        layout1.addView(view1);
        layout2.addView(view2);
        layout3.addView(view3);

        TabHost tabHost = findViewById(R.id.tabhost);
        tabHost.setup();

        TabHost.TabSpec tabSpec1 = tabHost.newTabSpec("런닝맨").setIndicator("런닝맨");
        tabSpec1.setContent(R.id.tab1);
        tabHost.addTab(tabSpec1);

        TabHost.TabSpec tabSpec2 = tabHost.newTabSpec("알고싶다").setIndicator("알고싶다");
        tabSpec2.setContent(R.id.tab2);
        tabHost.addTab(tabSpec2);

        TabHost.TabSpec tabSpec3 = tabHost.newTabSpec("나혼자").setIndicator("나혼자");
        tabSpec3.setContent(R.id.tab3);
        tabHost.addTab(tabSpec3);

        Button b05 = findViewById(R.id.b05);
        b05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.naver.com"));
                startActivity(intent);
            }
        });
    }
}
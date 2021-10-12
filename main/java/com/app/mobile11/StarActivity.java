package com.app.mobile11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TabHost;

public class StarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_star);

        TabHost tabHost = findViewById(R.id.tabHost2);
        tabHost.setup();

        TabHost.TabSpec tabSpecHome = tabHost.newTabSpec("HOME").setIndicator("홈");
        tabSpecHome.setContent(R.id.tabHome);
        tabHost.addTab(tabSpecHome);

        TabHost.TabSpec tabSpecCategory = tabHost.newTabSpec("CATEGORY").setIndicator("카테고리");
        tabSpecCategory.setContent(R.id.tabCategory);
        tabHost.addTab(tabSpecCategory);

        TabHost.TabSpec tabSpecGift = tabHost.newTabSpec("GIFT").setIndicator("선물함");
        tabSpecGift.setContent(R.id.tabGift);
        tabHost.addTab(tabSpecGift);

        tabHost.setCurrentTab(0);
    }
}
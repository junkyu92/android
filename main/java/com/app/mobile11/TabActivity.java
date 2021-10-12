package com.app.mobile11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TextView;

public class TabActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);

        LinearLayout layout1 = findViewById(R.id.tabSong);
        LinearLayout layout2 = findViewById(R.id.tabArtist);
        LinearLayout layout3 = findViewById(R.id.tabAlbum);

        View songView = View.inflate(TabActivity.this, R.layout.song, null);
        View artView = View.inflate(TabActivity.this, R.layout.art, null);
        View albumView = View.inflate(TabActivity.this, R.layout.album, null);

        layout1.addView(songView);
        layout2.addView(artView);
        layout3.addView(albumView);

        Button btnChange = songView.findViewById(R.id.btnChange);
        ImageView imageView = songView.findViewById(R.id.imageView11);
        btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setImageResource(R.drawable.a24);
            }
        });

        Button btnChange2 = artView.findViewById(R.id.btnChange2);
        ImageView imageView2 = artView.findViewById(R.id.imageView22);
        TextView textView2 = artView.findViewById(R.id.text22);
        btnChange2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView2.setImageResource(R.drawable.a24);
                textView2.setText("귀신이다");
            }
        });

        TabHost tabHost = findViewById(R.id.tabhost);
        tabHost.setup(); //기초적인 tab초기화

        TabHost.TabSpec tabSpecSong = tabHost.newTabSpec("SONG").setIndicator("음악별");
        tabSpecSong.setContent(R.id.tabSong);
        tabHost.addTab(tabSpecSong);

        TabHost.TabSpec tabSpecArtist = tabHost.newTabSpec("ARTIST").setIndicator("가수별");
        tabSpecArtist.setContent(R.id.tabArtist);
        tabHost.addTab(tabSpecArtist);

        TabHost.TabSpec tabSpecAlbum = tabHost.newTabSpec("ALBUM").setIndicator("앨범별");
        tabSpecAlbum.setContent(R.id.tabAlbum);
        tabHost.addTab(tabSpecAlbum);

        tabHost.setCurrentTab(0);
    }
}
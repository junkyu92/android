package com.mega.test05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        setTitle("리스트뷰 테스트");
        ArrayList<String> mid = new ArrayList<>();
        mid.add("히어로즈");
        mid.add("24시");
        mid.add("로스트");
        mid.add("빅뱅이론");
        ListView listView = findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, mid);
        listView.setAdapter(adapter);

        Button b06 = findViewById(R.id.b06);
        EditText et06 = findViewById(R.id.et06);
        b06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = et06.getText().toString();
                mid.add(data);
                adapter.notifyDataSetChanged();
            }
        });
    }
}
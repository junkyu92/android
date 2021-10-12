package com.app.mobile11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class AdapterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapter);
        setTitle("리스트뷰 테스트");
        ArrayList<String> mid = new ArrayList<>();
        mid.add("히어로즈");
        mid.add("24시");
        mid.add("로스트");
        mid.add("빅뱅이론");
        ListView listView = findViewById(R.id.listView1);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, mid);
        listView.setAdapter(adapter);

        Button button = findViewById(R.id.button);
        EditText editText = findViewById(R.id.EditText);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = editText.getText().toString();
                mid.add(data);
                adapter.notifyDataSetChanged();
            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String data = mid.get(i);
                Toast.makeText(getApplicationContext(), data, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
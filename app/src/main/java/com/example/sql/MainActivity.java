package com.example.sql;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private Button add;
    private Button read;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layerDB ly = new layerDB(getApplicationContext());
        add = findViewById(R.id.add);
        read = findViewById(R.id.read);
        add.setOnClickListener(v -> {
            long id = ly.addData("akshat", "sahijpal");
            if(id == -1){
                showMessage("Something is wrong in DB");
            }else{
                showMessage("Added Congratulations");
            }
        });
        read.setOnClickListener(v -> {
            ly.readData(getApplicationContext());
        });
    }
    void showMessage(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
}
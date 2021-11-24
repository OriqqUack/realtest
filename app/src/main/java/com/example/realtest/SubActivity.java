package com.example.realtest;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

    }

    public void btn1click(View v){
        Toast.makeText(this, "ㅋㅋ", Toast.LENGTH_SHORT).show();
    }
}

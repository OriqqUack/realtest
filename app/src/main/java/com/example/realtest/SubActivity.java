package com.example.realtest;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

    Button btn2=findViewById(R.id.btn2);
    btn2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    });
    }

    public void btn1click(View v){
        Toast toast=Toast.makeText(this, "유미", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.END | Gravity.BOTTOM,10,10);
        toast.show();
    }
    public void btn2click(View v){Toast.makeText(this,"닮음",Toast.LENGTH_SHORT).show();}
    public void btn3click(View v){Toast.makeText(this,"다람쥐",Toast.LENGTH_SHORT).show();}
}

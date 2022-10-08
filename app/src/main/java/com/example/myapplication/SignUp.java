package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class SignUp extends AppCompatActivity {
TextView full_name,user_name,password;
Button btn_dangky;
public static String ten,pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        user_name = findViewById(R.id.user_name);
        password = findViewById(R.id.password);
        btn_dangky = findViewById(R.id.dangky_btn);
        btn_dangky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dangnhap = new Intent(getApplicationContext(),Singin.class);
                ten = user_name.getText().toString();
                pass = password.getText().toString();

                startActivity(dangnhap);

            }
        });


    }
}
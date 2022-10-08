package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class Singin extends AppCompatActivity {
    TextView user_name,password;
    Button btn_dangnhap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singin);
        user_name = findViewById(R.id.user_name);
        password = findViewById(R.id.password);
        btn_dangnhap = findViewById(R.id.btn_dangnhap);


//        System.out.println(user);
        btn_dangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user= user_name.getText().toString();
                String pass = password.getText().toString();
                Intent intent = getIntent();
                System.out.println(intent.getStringExtra("user_name"));
                System.out.println(intent.getStringExtra("password"));
                if( user.equals(SignUp.ten)&& pass.equals(SignUp.pass)){
                    Toast.makeText(getApplicationContext(), "Đăng Nhập Thành Công", Toast.LENGTH_LONG).show();
                    Intent i = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(i);
                }
                else {
                    Toast.makeText(getApplicationContext(), "Đăng Nhập Không Thành Công", Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}
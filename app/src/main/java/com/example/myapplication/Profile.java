package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Trang Profile");
        TextView user_name = findViewById(R.id.user_name);
        TextView password = findViewById(R.id.password);
        Intent i = getIntent();
        user_name.setText(SignUp.ten);
        password.setText(SignUp.pass);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case android.R.id.home:
                //If this activity started from other activity
                finish();
                //Back button
            case R.id.page_1:
                //If this activity started from other activity
                Intent trangchu = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(trangchu);

            /*If you wish to open new activity and close this one
            startNewActivity();
            */
                return true;
            case R.id.page_2:
                Intent chitiet = new Intent(getApplicationContext(), Detail_Fragment.class);
                startActivity(chitiet);
                return true;
            case R.id.page_3:
                Intent dangxuat = new Intent(getApplicationContext(), Singin.class);
                startActivity(dangxuat);
                return true;
            case R.id.page_4:
//                Intent intent = getIntent();
//                Intent frofile = new Intent(getApplicationContext(), Profile.class);
//                frofile.putExtra("user_name", intent.getStringExtra("user_name"));
//                frofile.putExtra("password", intent.getStringExtra("password"));
//                startActivity(frofile);
                return false;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
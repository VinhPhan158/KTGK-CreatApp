package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class Detail_Fragment extends AppCompatActivity {
ImageView anhsp;
TextView tensp;
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
                Intent trangchu = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(trangchu);
            //Back button
            case R.id.page_1:
                //If this activity started from other activity
                Intent trangchu1 = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(trangchu1);

            /*If you wish to open new activity and close this one
            startNewActivity();
            */
                return true;
            case R.id.page_2:
                Intent chitiet = new Intent(getApplicationContext(),Detail_Fragment.class);
                startActivity(chitiet);
                return true;
            case R.id.page_3:
                Intent dangxuat = new Intent(getApplicationContext(),Singin.class);
                startActivity(dangxuat);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_fragment);
        tensp = findViewById(R.id.tensp);
        anhsp = findViewById(R.id.anhsp);
        Intent intent = getIntent();
        tensp.setText( intent.getStringExtra("name"));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Trang Chi Tiết");
        int id = intent.getIntExtra("image",0);
        Drawable drawable = getResources().getDrawable(id);
        anhsp.setImageDrawable(drawable);

    }
}
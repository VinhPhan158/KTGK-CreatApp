package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.myapplication.apdater.RecycleView_Adapter;
import com.example.myapplication.model.FoodEntity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
List<FoodEntity> foodList = new ArrayList<>();
RecyclerView rcv;

    private RecyclerView.LayoutManager layoutManager;
    private RecycleView_Adapter adapter;

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
                Intent trangchu = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(trangchu);

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
            case R.id.page_4:

                Intent frofile = new Intent(getApplicationContext(),Profile.class);

                startActivity(frofile);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rcv = findViewById(R.id.recycle_view);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Trang Chủ");
        layoutManager = new GridLayoutManager(this,2);
        rcv.setLayoutManager(layoutManager);
        for(int i = 1;i<10;i++){
            FoodEntity foodEntity = new FoodEntity(i,"Pizza "+i,R.drawable.pizza);
            foodList.add(foodEntity);
        adapter = new RecycleView_Adapter( MainActivity.this,foodList);
        rcv.setAdapter(adapter);


    }


}}
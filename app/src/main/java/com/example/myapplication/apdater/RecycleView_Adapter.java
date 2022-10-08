package com.example.myapplication.apdater;


import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.Detail_Fragment;
import com.example.myapplication.R;
import com.example.myapplication.model.FoodEntity;

import java.util.List;

public class RecycleView_Adapter extends  RecyclerView.Adapter<RecycleView_Adapter.ListAdapterViewHolder> {
    Context context;
    List<FoodEntity> foodEntityList;
    public  RecycleView_Adapter(Context context, List<FoodEntity> foodEntityList){
            this.context = context;
            this.foodEntityList = foodEntityList;
    }
    @NonNull
    @Override
    public ListAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.foolist, parent, false);
        return new ListAdapterViewHolder(view);

    }

    @SuppressLint("RecyclerView")
    @Override
    public void onBindViewHolder(@NonNull ListAdapterViewHolder holder, int position) {
        Resources res = context.getResources();
 int id = foodEntityList.get(position).getImage();
        holder.tv_name.setText(foodEntityList.get(position).getName());
        holder.Imv.setImageDrawable(res.getDrawable(id));
        holder.Imv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, Detail_Fragment.class);
                intent.putExtra("name",foodEntityList.get(position).getName());
                intent.putExtra("image",foodEntityList.get(position).getImage());
                System.out.println(foodEntityList.get(position).getName());
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return foodEntityList.size();
    }

    public  class ListAdapterViewHolder extends RecyclerView.ViewHolder  {

        private ImageView Imv;
        private TextView tv_name;

        public ListAdapterViewHolder(@NonNull View itemView) {

            super(itemView);
            tv_name = itemView.findViewById(R.id.name);
            Imv = itemView.findViewById(R.id.image);

        }



    }

}

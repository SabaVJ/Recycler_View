package com.example.my_recycle_practice.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.my_recycle_practice.Model.Model_Class;
import com.example.my_recycle_practice.R;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class Adapter_Class extends RecyclerView.Adapter<Adapter_Class.ViewHolder>{

    public Context context;
    public ArrayList<Model_Class> arrayList;

    public Adapter_Class(Context context, ArrayList<Model_Class> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_item,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Model_Class model_class = arrayList.get(position);

        holder.userName.setText(model_class.getUserName());
        holder.userImg.setImageResource(model_class.getUserImg());
        holder.uploadImg.setImageResource(model_class.getUploadImg());

        holder.settingsImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Settings", Toast.LENGTH_SHORT).show();
            }
        });
        holder.likeImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Like", Toast.LENGTH_SHORT).show();
            }
        });
        holder.commentImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Comment", Toast.LENGTH_SHORT).show();
            }
        });
        holder.shareImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Share", Toast.LENGTH_SHORT).show();
            }
        });
        holder.saveImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Save", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView userName;
        CircleImageView userImg;
        ImageView uploadImg;
        ImageView settingsImg,likeImg,commentImg,shareImg,saveImg;



        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            userName = itemView.findViewById(R.id.userNameTxt);
            userImg = itemView.findViewById(R.id.userImg);
            uploadImg = itemView.findViewById(R.id.uploadImg);
            likeImg = itemView.findViewById(R.id.likeImg);
            shareImg = itemView.findViewById(R.id.shareImg);
            commentImg = itemView.findViewById(R.id.commentImg);
            saveImg = itemView.findViewById(R.id.saveImg);
            settingsImg = itemView.findViewById(R.id.settingsImg);

        }
    }
}

package com.example.my_recycle_practice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.my_recycle_practice.Adapter.Adapter_Class;
import com.example.my_recycle_practice.Model.Model_Class;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    Adapter_Class adapterClass;
    ArrayList<Model_Class> model_classArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        model_classArrayList = new ArrayList<>();

        model_classArrayList.add(new Model_Class(R.drawable.musk_img,"Elon Musk",R.drawable.musk_post_img));
        model_classArrayList.add(new Model_Class(R.drawable.bilgates,"Bilgates",R.drawable.bilgates_post_img));
        model_classArrayList.add(new Model_Class(R.drawable.sundhar,"Sundhar Pichai",R.drawable.sundhar_upload_img));
        model_classArrayList.add(new Model_Class(R.drawable.ambani,"Mukesh AMbani",R.drawable.ambani_upload_img));
        model_classArrayList.add(new Model_Class(R.drawable.musk_img,"Elon Musk",R.drawable.musk_post_img));
        model_classArrayList.add(new Model_Class(R.drawable.bilgates,"Bilgates",R.drawable.bilgates_post_img));
        model_classArrayList.add(new Model_Class(R.drawable.sundhar,"Sundhar Pichai",R.drawable.sundhar_upload_img));
        model_classArrayList.add(new Model_Class(R.drawable.ambani,"Mukesh AMbani",R.drawable.ambani_upload_img));
        model_classArrayList.add(new Model_Class(R.drawable.musk_img,"Elon Musk",R.drawable.musk_post_img));
        model_classArrayList.add(new Model_Class(R.drawable.bilgates,"Bilgates",R.drawable.bilgates_post_img));
        model_classArrayList.add(new Model_Class(R.drawable.sundhar,"Sundhar Pichai",R.drawable.sundhar_upload_img));
        model_classArrayList.add(new Model_Class(R.drawable.ambani,"Mukesh AMbani",R.drawable.ambani_upload_img));
        model_classArrayList.add(new Model_Class(R.drawable.musk_img,"Elon Musk",R.drawable.musk_post_img));
        model_classArrayList.add(new Model_Class(R.drawable.bilgates,"Bilgates",R.drawable.bilgates_post_img));
        model_classArrayList.add(new Model_Class(R.drawable.sundhar,"Sundhar Pichai",R.drawable.sundhar_upload_img));
        model_classArrayList.add(new Model_Class(R.drawable.ambani,"Mukesh AMbani",R.drawable.ambani_upload_img));
        model_classArrayList.add(new Model_Class(R.drawable.musk_img,"Elon Musk",R.drawable.musk_post_img));
        model_classArrayList.add(new Model_Class(R.drawable.bilgates,"Bilgates",R.drawable.bilgates_post_img));
        model_classArrayList.add(new Model_Class(R.drawable.sundhar,"Sundhar Pichai",R.drawable.sundhar_upload_img));
        model_classArrayList.add(new Model_Class(R.drawable.ambani,"Mukesh AMbani",R.drawable.ambani_upload_img));

        recyclerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Clicked", Toast.LENGTH_SHORT).show();
            }
        });
        setAdapter();




    }

    private void setAdapter() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapterClass = new Adapter_Class(this,model_classArrayList);
        recyclerView.setAdapter(adapterClass);
    }
}
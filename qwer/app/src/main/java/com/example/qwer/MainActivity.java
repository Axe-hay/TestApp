package com.example.qwer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;


    ArrayList<MainModels> mainModels;
    Adapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerView);

        //creating integer array of images
        Integer[] img ={R.drawable.ic_launcher_background , R.drawable.ic_launcher_foreground, R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, R.drawable.knifenfork, R.drawable.star};


        //Initializing ArrayList
        mainModels=new ArrayList<>();
        for(int i=0;i<img.length;i++)
        {
            MainModels models=new MainModels(img[i]);
            mainModels.add(models);
        }

        //Horizontal Scroll
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        //Adapter initialisation:
        adapter=new Adapter(MainActivity.this,mainModels);

        //Setting Adapter to RecyclerView:
        recyclerView.setAdapter(adapter);

    }
}
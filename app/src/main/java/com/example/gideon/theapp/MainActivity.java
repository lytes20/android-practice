package com.example.gideon.theapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String [] text = {"Samsung", "Apple", "Huawei", "LG", "Sony", "See more"};

        GridView myGrid = (GridView) findViewById(R.id.mygrid);
        MyAdapter myAdapter = new MyAdapter(MainActivity.this, text);
        myGrid.setAdapter(myAdapter);
    }
}

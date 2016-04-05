package com.bdjobs.creatingflexibleuifragments;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AnotherActivity extends AppCompatActivity
{
    android.app.FragmentManager manager;
    FragmentB fb;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);

        Intent intent = getIntent();
        int index = intent.getIntExtra("index",0);
        manager = getFragmentManager();
        fb = (FragmentB) manager.findFragmentById(R.id.fragment2);
        if(fb !=null)
        {
          fb.changeData(index);
        }
    }

}

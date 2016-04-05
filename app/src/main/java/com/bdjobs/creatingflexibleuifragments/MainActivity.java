package com.bdjobs.creatingflexibleuifragments;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements FragmentA.Communicator
{
    FragmentA fa;
    FragmentB fb;
    android.app.FragmentManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        manager = getFragmentManager();
        fa = (FragmentA) manager.findFragmentById(R.id.fragment);
        fa.setCommunicator(this);
    }

    @Override
    public void respond(int index)
    {
        fb = (FragmentB) manager.findFragmentById(R.id.fragment2);
        if( fb!=null && fb.isVisible())
        {
            fb.changeData(index);
        }
        else
        {
            Intent intent = new Intent(MainActivity.this,AnotherActivity.class);
            intent.putExtra("index",index);
            startActivity(intent);

        }
    }
}

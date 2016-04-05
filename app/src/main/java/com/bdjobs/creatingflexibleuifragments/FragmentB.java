package com.bdjobs.creatingflexibleuifragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Tabriz on 3/31/2016.
 */
public class FragmentB extends Fragment
{
    TextView textView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_b_layout,container,false);
        textView= (TextView) view.findViewById(R.id.textView);
        return view;
    }

    public void changeData(int index)
    {
        String[] description = getResources().getStringArray(R.array.description);
        textView.setText(description[index]);
    }
}

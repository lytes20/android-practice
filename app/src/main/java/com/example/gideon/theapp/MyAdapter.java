package com.example.gideon.theapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by gideon on 12/10/2017.
 */

public class MyAdapter extends BaseAdapter {

    private Context mContext;
    private String [] textArray;
    private LayoutInflater inflater;

    public MyAdapter(Context mContext, String [] textArray) {
        this.mContext = mContext;
        this.textArray = textArray;
    }


    @Override
    public int getCount() {
        return textArray.length;
    }

    @Override
    public Object getItem(int i) {
        return textArray[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View gridView = view;
        if(view == null){
            inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            gridView = inflater.inflate(R.layout.grid_item, null);
        }
        TextView  tv = gridView.findViewById(R.id.textView);
        tv.setText(textArray[i]);
        return gridView;
    }
}

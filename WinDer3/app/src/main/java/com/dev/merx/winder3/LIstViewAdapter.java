package com.dev.merx.winder3;

import android.app.ListActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by merx on 15-4-19.
 */
public class LIstViewAdapter extends BaseAdapter{
    String[] data = new String[]{"acs","s","dd","sa"};

    public LIstViewAdapter(MainActivity mainActivity) {
    }

    @Override
    public int getCount() {
        return data.length;
    }

    @Override
    public String getItem(int position) {
        return data[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        
        return null;
    }
}

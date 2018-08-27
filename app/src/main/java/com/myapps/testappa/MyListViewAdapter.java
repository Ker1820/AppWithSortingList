package com.myapps.testappa;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.myapps.testappa.Fragments.HistoryFragment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyListViewAdapter extends BaseAdapter {
    private static List<String> names;
    LayoutInflater layoutInflater;
    public MyListViewAdapter(){

    }

    public MyListViewAdapter(Context context, List<String> names) {
        this.names = names;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return names.size();
    }

    @Override
    public Object getItem(int position) {
        return names.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if(view == null) {
            view = layoutInflater.inflate(R.layout.res_for_list, parent, false);
        }
        TextView textView = view.findViewById(R.id.text_view);
        textView.setText((String)getItem(position));
        notifyDataSetChanged();


        return view;
    }

    public static void sortListAZ(){
        Log.i("ITEMMENU","PUSH");
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

    }
    public static void sortListZA(){
        Log.i("ITEMMENU","PUSH");
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });

    }
}

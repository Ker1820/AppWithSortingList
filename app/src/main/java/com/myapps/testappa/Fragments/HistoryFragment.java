package com.myapps.testappa.Fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.myapps.testappa.MyListViewAdapter;
import com.myapps.testappa.R;

import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
public class HistoryFragment extends Fragment {
    private List<String> myList;
    private ListView listView;
    private static MyListViewAdapter adapter;
    public HistoryFragment(){

    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.history_fragment_layout,container,false);
        listView = view.findViewById(R.id.list_view);
        myList = initList();
        adapter = new MyListViewAdapter(view.getContext(), myList);
        listView.setAdapter(adapter);
        return view;
    }
    public List<String> initList(){
        myList = new ArrayList<>();
        myList.add("Kirill");
        myList.add("Jack");
        myList.add("Max");
        myList.add("Shasha");
        myList.add("Den");
        myList.add("Alex");
        return myList;
    }
    public static MyListViewAdapter getMyAdapter(){
        return adapter;
    }
}

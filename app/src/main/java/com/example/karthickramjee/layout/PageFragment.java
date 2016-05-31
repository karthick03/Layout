package com.example.karthickramjee.layout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class PageFragment extends Fragment {
    public static final String ARG_PAGE = "ARG_PAGE";

    private int mPage;
    private ListView mainListView ;
    private ArrayAdapter<String> listAdapter ;
    public static PageFragment newInstance(int page) {
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        PageFragment fragment = new PageFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPage = getArguments().getInt(ARG_PAGE);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view1= inflater.inflate(R.layout.fragment_page, container, false);
        mainListView=(ListView) view1;
        if(mPage==1) {
            String[] planets = new String[]{"Mercury", "Venus", "Earth", "Mars",
                    "Jupiter", "Saturn", "Uranus", "Neptune"};
            ArrayList<String> planetList = new ArrayList<String>();
            planetList.addAll(Arrays.asList(planets));
            listAdapter = new ArrayAdapter<String>(getContext(), R.layout.simplerow, planetList);
            mainListView.setAdapter(listAdapter);
        }
        else if(mPage==2)
        {
            String[] days = new String[]{"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
            ArrayList<String> planetList = new ArrayList<String>();
            planetList.addAll(Arrays.asList(days));
            listAdapter = new ArrayAdapter<String>(getContext(), R.layout.simplerow, planetList);
            mainListView.setAdapter(listAdapter);
        }
        else
        {
            String[] fruits = new String[]{"Apple","Mango","Orange"};
            ArrayList<String> planetList = new ArrayList<String>();
            planetList.addAll(Arrays.asList(fruits));
            listAdapter = new ArrayAdapter<String>(getContext(), R.layout.simplerow, planetList);
            mainListView.setAdapter(listAdapter);
        }
        return view1;
    }
}
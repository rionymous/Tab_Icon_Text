package com.androidrion.tabicontext;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentDashboard extends Fragment {


    public FragmentDashboard() {
        // Required empty public constructor
    }

    public static FragmentDashboard newInstance() {
        
        Bundle args = new Bundle();
        
        FragmentDashboard fragment = new FragmentDashboard();
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dashboard, container, false);
    }

}

package com.androidrion.tabicontext;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentCall extends Fragment {


    public FragmentCall() {
        // Required empty public constructor
    }

    public static FragmentCall newInstance() {
        
        Bundle args = new Bundle();
        
        FragmentCall fragment = new FragmentCall();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_call, container, false);
    }

}

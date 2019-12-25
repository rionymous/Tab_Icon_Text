package com.androidrion.tabicontext;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentChat extends Fragment {
    public FragmentChat() {
        // Required empty public constructor
    }

    public static FragmentChat newInstance() {
        
        Bundle args = new Bundle();
        
        FragmentChat fragment = new FragmentChat();
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_chat, container, false);
    }
    
}

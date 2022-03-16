package com.dailynews.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.dailynews.R;

public class footballFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root =  inflater.inflate(R.layout.fragment_football, container, false);

        WebView webView = root.findViewById(R.id.webViewFootball);
        webView.loadUrl("https://onefootball.com/en/home");

        return root;
    }
}
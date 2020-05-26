package com.example.m3_a2_hm6.fragments;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.m3_a2_hm6.R;
import com.example.m3_a2_hm6.interfaces.ICalculatorClick;

public class Fragment_panel extends Fragment {

    private ICalculatorClick iCalculatorClick;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        return inflater.inflate(R.layout.fragment_panel, container, false);
    }
}

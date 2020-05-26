package com.example.m3_a2_hm6.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.m3_a2_hm6.R;
import com.example.m3_a2_hm6.interfaces.ICalculatorClick;

public class Fragment_keyboard extends Fragment {
    private ICalculatorClick iCalculatorClick;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        iCalculatorClick = (ICalculatorClick) getActivity();

        View v = inflater.inflate(R.layout.fragment_keyboard, container, false);
        onClickListener(v);
        return v;
    }

    private void onClickListener(View v){
        v.findViewById(R.id.fragment_keyboard_button0).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iCalculatorClick.tappingNumber(v);
            }
        });

        v.findViewById(R.id.fragment_keyboard_button1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iCalculatorClick.tappingNumber(v);
            }
        });

        v.findViewById(R.id.fragment_keyboard_button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iCalculatorClick.tappingNumber(v);
            }
        });

        v.findViewById(R.id.fragment_keyboard_button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iCalculatorClick.tappingNumber(v);
            }
        });

        v.findViewById(R.id.fragment_keyboard_button4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iCalculatorClick.tappingNumber(v);
            }
        });

        v.findViewById(R.id.fragment_keyboard_button5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iCalculatorClick.tappingNumber(v);
            }
        });


        v.findViewById(R.id.fragment_keyboard_button6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iCalculatorClick.tappingNumber(v);
            }
        });


        v.findViewById(R.id.fragment_keyboard_button7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iCalculatorClick.tappingNumber(v);
            }
        });


        v.findViewById(R.id.fragment_keyboard_button8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iCalculatorClick.tappingNumber(v);
            }
        });


        v.findViewById(R.id.fragment_keyboard_button9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iCalculatorClick.tappingNumber(v);
            }
        });

        v.findViewById(R.id.fragment_keyboard_buttonAddition).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iCalculatorClick.tappingLogic(v);
            }
        });


        v.findViewById(R.id.fragment_keyboard_buttonSubtraction).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iCalculatorClick.tappingLogic(v);
            }
        });


        v.findViewById(R.id.fragment_keyboard_buttonClear).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iCalculatorClick.tappingLogic(v);
            }
        });


        v.findViewById(R.id.fragment_keyboard_buttonBack).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iCalculatorClick.tappingLogic(v);
            }
        });


        v.findViewById(R.id.fragment_keyboard_buttonDivision).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iCalculatorClick.tappingLogic(v);
            }
        });


        v.findViewById(R.id.fragment_keyboard_buttonMultiplication).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iCalculatorClick.tappingLogic(v);
            }
        });


        v.findViewById(R.id.fragment_keyboard_buttonEquals).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iCalculatorClick.tappingLogic(v);
            }
        });


        v.findViewById(R.id.fragment_keyboard_buttonComma).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iCalculatorClick.tappingLogic(v);
            }
        });

    }

}

package com.example.m3_a2_hm6;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;


import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.m3_a2_hm6.interfaces.ICalculatorClick;

import java.util.Objects;

public class MainActivity extends AppCompatActivity implements ICalculatorClick {
    TextView textViewForPanel;
    int counter = 1;
    Double firstNumber, secondNumber;
    String intermediateNumber = "0";
    String operation, resultInString = "";
    double intermediateResult = 0;
    boolean isFirst, resetAfterOperation, isFirstForZero = false;
    boolean isFirstForDot = true;


    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clear();
        initialization();
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    public void initialization(){
        Fragment fragmentPanel = getSupportFragmentManager().findFragmentById(R.id.fragment_panel);
        assert fragmentPanel != null;
        textViewForPanel = Objects.requireNonNull(fragmentPanel.getView()).findViewById(R.id.fragmentPanel_textViewForPanel);


    }

    @Override
    public void tappingNumber(View v) {
        if (intermediateNumber.equals("0"))
            isFirstForZero = false;
        if (counter <= 9) {
            if (resetAfterOperation) {
                resultInString = "";
                textViewForPanel.setText("");
                resetAfterOperation = !resetAfterOperation;

            }
            switch (v.getId()) {
                case R.id.fragment_keyboard_button0:
                    if (isFirstForZero) {
                        textViewForPanel.append("0");
                        intermediateNumber += "0";
                        counter++;
                        isFirst = true;
                    }
                    break;
                case R.id.fragment_keyboard_button1:
                    if (counter == 1) {
                        textViewForPanel.setText("1");
                        intermediateNumber = "1";
                        isFirst = true;
                        counter++;
                        isFirstForZero = true;
                    } else {
                        textViewForPanel.append("1");
                        intermediateNumber += "1";
                        isFirst = true;
                        counter++;
                        isFirstForZero = true;
                    }
                    break;
                case R.id.fragment_keyboard_button2:
                    if (counter == 1) {
                        textViewForPanel.setText("2");
                        intermediateNumber = "2";
                        isFirst = true;
                        counter++;
                        isFirstForZero = true;
                    } else {
                        textViewForPanel.append("2");
                        intermediateNumber += "2";
                        isFirst = true;
                        counter++;
                        isFirstForZero = true;
                    }
                    break;
                case R.id.fragment_keyboard_button3:
                    if (counter == 1) {
                        textViewForPanel.setText("3");
                        intermediateNumber = "3";
                        isFirst = true;
                        counter++;
                        isFirstForZero = true;
                    } else {
                        textViewForPanel.append("3");
                        intermediateNumber += "3";
                        isFirst = true;
                        counter++;
                        isFirstForZero = true;
                    }
                    break;
                case R.id.fragment_keyboard_button4:
                    if (counter == 1) {
                        textViewForPanel.setText("4");
                        intermediateNumber = "4";
                        isFirst = true;
                        counter++;
                        isFirstForZero = true;
                    } else {
                        textViewForPanel.append("4");
                        intermediateNumber += "4";
                        isFirst = true;
                        counter++;
                        isFirstForZero = true;
                    }
                    break;
                case R.id.fragment_keyboard_button5:
                    if (counter == 1) {
                        textViewForPanel.setText("5");
                        intermediateNumber = "5";
                        isFirst = true;
                        counter++;
                        isFirstForZero = true;
                    } else {
                        textViewForPanel.append("5");
                        intermediateNumber += "5";
                        isFirst = true;
                        counter++;
                        isFirstForZero = true;
                    }
                    break;
                case R.id.fragment_keyboard_button6:
                    if (counter == 1) {
                        textViewForPanel.setText("6");
                        intermediateNumber = "6";
                        isFirst = true;
                        counter++;
                        isFirstForZero = true;
                    } else {
                        textViewForPanel.append("6");
                        intermediateNumber += "6";
                        isFirst = true;
                        counter++;
                        isFirstForZero = true;
                    }
                    break;
                case R.id.fragment_keyboard_button7:
                    if (counter == 1) {
                        textViewForPanel.setText("7");
                        intermediateNumber = "7";
                        isFirst = true;
                        counter++;
                        isFirstForZero = true;
                    } else {
                        textViewForPanel.append("7");
                        intermediateNumber += "7";
                        isFirst = true;
                        counter++;
                        isFirstForZero = true;
                    }
                    break;
                case R.id.fragment_keyboard_button8:
                    if (counter == 1) {
                        textViewForPanel.setText("8");
                        intermediateNumber = "8";
                        isFirst = true;
                        counter++;
                        isFirstForZero = true;
                    } else {
                        textViewForPanel.append("8");
                        intermediateNumber += "8";
                        isFirst = true;
                        counter++;
                        isFirstForZero = true;
                    }
                    break;
                case R.id.fragment_keyboard_button9:
                    if (counter == 1) {
                        textViewForPanel.setText("9");
                        intermediateNumber = "9";
                        isFirst = true;
                        counter++;
                        isFirstForZero = true;
                    } else {
                        textViewForPanel.append("9");
                        intermediateNumber += "9";
                        isFirst = true;
                        counter++;
                        isFirstForZero = true;
                    }
                    break;
                case R.id.fragment_keyboard_buttonComma:
                    if (counter == 1) {
                        isFirstForDot = true;
                        isFirst = true;
                        counter++;
                    }
                    if (isFirst && isFirstForDot) {
                        textViewForPanel.append(".");
                        intermediateNumber += ".";
                        isFirst = false;
                        isFirstForDot = false;
                        isFirstForZero = true;
                    }
                    break;
            }
        }
    }

    @Override
    public void tappingLogic(View v) {
        switch (v.getId()) {
            case R.id.fragment_keyboard_buttonAddition:
                if (isFirst) {
                    intermediateResult = Double.parseDouble(intermediateNumber);
                    firstNumber = intermediateResult;
                    counter = 1;
                    operation = "+";

                    textViewForPanel.setText("0");
                    intermediateNumber = "0";
                    isFirstForDot = true;
                    isFirst = false;
                }
                break;

            case R.id.fragment_keyboard_buttonSubtraction:
                if (isFirst) {
                    intermediateResult = Double.parseDouble(intermediateNumber);
                    firstNumber = intermediateResult;
                    counter = 1;
                    operation = "-";
                    textViewForPanel.setText("0");
                    intermediateNumber = "0";
                    isFirstForDot = true;
                    isFirst = false;
                }
                break;

            case R.id.fragment_keyboard_buttonMultiplication:
                if (isFirst) {
                    intermediateResult = Double.parseDouble(intermediateNumber);
                    firstNumber = intermediateResult;
                    counter = 1;
                    operation = "*";
                    textViewForPanel.setText("0");
                    intermediateNumber = "0";
                    isFirstForDot = true;
                    isFirst = false;
                }
                break;

            case R.id.fragment_keyboard_buttonDivision:
                if (isFirst) {
                    intermediateResult = Double.parseDouble(intermediateNumber);
                    firstNumber = intermediateResult;
                    counter = 1;
                    operation = "/";
                    textViewForPanel.setText("0");
                    intermediateNumber = "0";
                    isFirstForDot = true;
                    isFirst = false;
                }
                break;

            case R.id.fragment_keyboard_buttonBack:
                intermediateNumber = "0";
                isFirstForDot = true;
                counter = 1;
                textViewForPanel.setText(intermediateNumber);
                break;

            case R.id.fragment_keyboard_buttonClear:
                clear();

                textViewForPanel.setText("0");
                break;

            case R.id.fragment_keyboard_buttonEquals:
                if (!operation.equals("")) {
                    secondNumber = Double.valueOf(intermediateNumber);
                    textViewForPanel.setText("");
                    switch (operation) {
                        case "+":
                            resultInString = Double.parseDouble(String.valueOf(firstNumber))
                                    + Double.parseDouble(String.valueOf(secondNumber)) + "";
                            break;

                        case "-":
                            resultInString = Double.parseDouble(String.valueOf(firstNumber))
                                    - Double.parseDouble(String.valueOf(secondNumber)) + "";
                            break;

                        case "*":
                            resultInString = Double.parseDouble(String.valueOf(firstNumber))
                                    * Double.parseDouble(String.valueOf(secondNumber)) + "";
                            break;

                        case "/":
                            resultInString = Double.parseDouble(String.valueOf(firstNumber))
                                    / Double.parseDouble(String.valueOf(secondNumber)) + "";
                            break;
                    }
                    resetAfterOperation = true;
                    textViewForPanel.setText(resultInString);
                    clear();

                }
                break;
        }

    }

    public void clear() {
        intermediateNumber = "0";
        operation = "";
        firstNumber = 0.0;
        secondNumber = 0.0;
        isFirstForZero = false;
        isFirst = false;
        isFirstForDot = true;
        counter = 1;
    }
}

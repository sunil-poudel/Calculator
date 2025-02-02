package com.sunil_poudel.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button shiftButton;
    private Button alphaButton;
    private Button upButton;
    private Button downButton;
    private Button leftButton;
    private Button rightButton;
    private Button okButton;
    private Button modeButton;
    private Button onButton;
    private Button oneButton;
    private Button twoButton;
    private Button threeButton;
    private Button fourButton;
    private Button fiveButton;
    private Button sixButton;
    private Button sevenButton;
    private Button eightButton;
    private Button nineButton;
    private Button zeroButton;
    private Button zeroZeroButton;
    private Button backspaceButton;
    private Button resetButton;
    private Button multiplyButton;
    private Button divideButton;
    private Button plusButton;
    private Button minusButton;
    private Button ansButton;
    private Button equalsButton;

    private TextView displayCalculationInput;
    private TextView displayCalculationOutput;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        shiftButton = findViewById(R.id.shift_button);
        alphaButton = findViewById(R.id.alpha_button);
        upButton = findViewById(R.id.up_button);
        downButton = findViewById(R.id.down_button);
        leftButton = findViewById(R.id.left_button);
        rightButton = findViewById(R.id.right_button);
        okButton = findViewById(R.id.ok_button);
        modeButton = findViewById(R.id.mode_button);
        onButton = findViewById(R.id.on_button);
        oneButton = findViewById(R.id.one_button);
        twoButton = findViewById(R.id.two_button);
        threeButton = findViewById(R.id.three_button);
        fourButton = findViewById(R.id.four_button);
        fiveButton = findViewById(R.id.five_button);
        sixButton = findViewById(R.id.six_button);
        sevenButton = findViewById(R.id.seven_button);
        eightButton = findViewById(R.id.eight_button);
        nineButton = findViewById(R.id.nine_button);
        zeroButton = findViewById(R.id.zero_button);
        zeroZeroButton = findViewById(R.id.zero_zero_button);
        backspaceButton = findViewById(R.id.backspace_button);
        resetButton = findViewById(R.id.reset_button);
        multiplyButton = findViewById(R.id.multiply_button);
        divideButton = findViewById(R.id.divide_button);
        plusButton = findViewById(R.id.plus_button);
        minusButton = findViewById(R.id.minus_button);
        ansButton = findViewById(R.id.ans_button);
        equalsButton = findViewById(R.id.equals_button);

        displayCalculationInput = findViewById(R.id.display_calculation_input);
        displayCalculationInput.setText("");
        displayCalculationOutput = findViewById(R.id.display_calculation_output);
        displayCalculationOutput.setText("");

        shiftButton.setOnClickListener(this);
        alphaButton.setOnClickListener(this);
        upButton.setOnClickListener(this);
        downButton.setOnClickListener(this);
        leftButton.setOnClickListener(this);
        rightButton.setOnClickListener(this);
        okButton.setOnClickListener(this);
        modeButton.setOnClickListener(this);
        onButton.setOnClickListener(this);
        oneButton.setOnClickListener(this);
        twoButton.setOnClickListener(this);
        threeButton.setOnClickListener(this);
        fourButton.setOnClickListener(this);
        fiveButton.setOnClickListener(this);
        sixButton.setOnClickListener(this);
        sevenButton.setOnClickListener(this);
        eightButton.setOnClickListener(this);
        nineButton.setOnClickListener(this);
        zeroButton.setOnClickListener(this);
        zeroZeroButton.setOnClickListener(this);
        backspaceButton.setOnClickListener(this);
        resetButton.setOnClickListener(this);
        multiplyButton.setOnClickListener(this);
        divideButton.setOnClickListener(this);
        plusButton.setOnClickListener(this);
        minusButton.setOnClickListener(this);
        ansButton.setOnClickListener(this);
        equalsButton.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

            if (v.getId() == R.id.shift_button) {
                displayCalculationInput.setText("clicked shift");
            } else if (v.getId() == R.id.alpha_button) {
                // Handle alpha button click
            } else if (v.getId() == R.id.up_button) {
                // Handle up button click
            } else if (v.getId() == R.id.down_button) {
                // Handle down button click
            } else if (v.getId() == R.id.left_button) {
                // Handle left button click
            } else if (v.getId() == R.id.right_button) {
                // Handle right button click
            } else if (v.getId() == R.id.ok_button) {
                // Handle ok button click
            } else if (v.getId() == R.id.mode_button) {
                // Handle mode button click
            } else if (v.getId() == R.id.on_button) {
                // Handle on button click
            } else if (v.getId() == R.id.one_button) {
                displayCalculationInput.append("1");
            } else if (v.getId() == R.id.two_button) {
                displayCalculationInput.append("2");
            } else if (v.getId() == R.id.three_button) {
                displayCalculationInput.append("3");
            } else if (v.getId() == R.id.four_button) {
                displayCalculationInput.append("4");
            } else if (v.getId() == R.id.five_button) {
                displayCalculationInput.append("5");
            } else if (v.getId() == R.id.six_button) {
                displayCalculationInput.append("6");
            } else if (v.getId() == R.id.seven_button) {
                displayCalculationInput.append("7");
            } else if (v.getId() == R.id.eight_button) {
                displayCalculationInput.append("8");
            } else if (v.getId() == R.id.nine_button) {
                displayCalculationInput.append("9");
            } else if (v.getId() == R.id.zero_button) {
                displayCalculationInput.append("0");
            } else if (v.getId() == R.id.zero_zero_button) {
                displayCalculationInput.append("00");
            } else if (v.getId() == R.id.backspace_button) {
                // Handle backspace button click
            } else if (v.getId() == R.id.reset_button) {
                // Handle reset button click
            } else if (v.getId() == R.id.multiply_button) {
                displayCalculationInput.append("*");
            } else if (v.getId() == R.id.divide_button) {
                displayCalculationInput.append("/");
            } else if (v.getId() == R.id.plus_button) {
                displayCalculationInput.append("+");
            } else if (v.getId() == R.id.minus_button) {
                displayCalculationInput.append("-");
            } else if (v.getId() == R.id.ans_button) {
                displayCalculationInput.append("ANS");
            } else if (v.getId() == R.id.equals_button) {
                // Handle equals button click

        }
    }
}
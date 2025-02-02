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
        displayCalculationOutput = findViewById(R.id.display_calculation_output);

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
                // Handle one button click
            } else if (v.getId() == R.id.two_button) {
                // Handle two button click
            } else if (v.getId() == R.id.three_button) {
                // Handle three button click
            } else if (v.getId() == R.id.four_button) {
                // Handle four button click
            } else if (v.getId() == R.id.five_button) {
                // Handle five button click
            } else if (v.getId() == R.id.six_button) {
                // Handle six button click
            } else if (v.getId() == R.id.seven_button) {
                // Handle seven button click
            } else if (v.getId() == R.id.eight_button) {
                // Handle eight button click
            } else if (v.getId() == R.id.nine_button) {
                // Handle nine button click
            } else if (v.getId() == R.id.zero_button) {
                // Handle zero button click
            } else if (v.getId() == R.id.zero_zero_button) {
                // Handle zero zero button click
            } else if (v.getId() == R.id.backspace_button) {
                // Handle backspace button click
            } else if (v.getId() == R.id.reset_button) {
                // Handle reset button click
            } else if (v.getId() == R.id.multiply_button) {
                // Handle multiply button click
            } else if (v.getId() == R.id.divide_button) {
                // Handle divide button click
            } else if (v.getId() == R.id.plus_button) {
                // Handle plus button click
            } else if (v.getId() == R.id.minus_button) {
                // Handle minus button click
            } else if (v.getId() == R.id.ans_button) {
                // Handle ans button click
            } else if (v.getId() == R.id.equals_button) {
                // Handle equals button click

        }
    }
}
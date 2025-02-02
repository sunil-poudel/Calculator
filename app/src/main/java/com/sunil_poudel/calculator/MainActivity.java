package com.sunil_poudel.calculator;

import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
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



    }
}
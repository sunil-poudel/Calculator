package com.sunil_poudel.calculator;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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
    private Button openingParenthesisButton;
    private Button closingParenthesisButton;
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
    private Button pointButton;
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

        toPostFix("100*(10-2)");

        shiftButton = findViewById(R.id.shift_button);
        alphaButton = findViewById(R.id.alpha_button);
        upButton = findViewById(R.id.up_button);
        downButton = findViewById(R.id.down_button);
        leftButton = findViewById(R.id.left_button);
        rightButton = findViewById(R.id.right_button);
        okButton = findViewById(R.id.ok_button);
        modeButton = findViewById(R.id.mode_button);
        onButton = findViewById(R.id.on_button);
        openingParenthesisButton = findViewById(R.id.opening_parenthesis_button);
        closingParenthesisButton = findViewById(R.id.closing_parenthesis_button);
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
        pointButton = findViewById(R.id.point_button);

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
        openingParenthesisButton.setOnClickListener(this);
        closingParenthesisButton.setOnClickListener(this);
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
        pointButton.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

            if (v.getId() == R.id.shift_button) {
                // Handle shift button click
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
            } else if (v.getId() == R.id.opening_parenthesis_button) {
                displayCalculationInput.append("(");
            } else if (v.getId() == R.id.closing_parenthesis_button) {
                displayCalculationInput.append(")");
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
                String temp = displayCalculationInput.getText().toString();
                if(!temp.isEmpty()){
                    temp = temp.substring(0, temp.length()-1);
                    displayCalculationInput.setText(temp);
                }
            } else if (v.getId() == R.id.reset_button) {
                displayCalculationInput.setText("");
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
                String input = displayCalculationInput.getText().toString();
                Stack<String> postfixStack = toPostFix(input);
                String result = doCalculation(postfixStack);
                displayCalculationOutput.setText(result);
            } else if(v.getId() == R.id.point_button){
                displayCalculationInput.append(".");
            }
    }

    public static Stack<String> toPostFix(String infix){
            Stack<String> stack = new Stack<>();
            Stack<String> postfixStack = new Stack<>();
            StringBuilder postfix = new StringBuilder();
            char[] infixArray = infix.toCharArray();

            for(int i=0; i< infixArray.length; i++){
                char c = infixArray[i];
                if(Character.isDigit(c)) {
                    String[] returned = extractDigit(infixArray, i);
                    String operand = returned[0];
                    i = Integer.parseInt(returned[1]);

                    postfix.append(operand);
                    postfixStack.push(operand);
                    System.out.println(operand);
                } else if(c=='('){
                    stack.push(String.valueOf(c));
                } else if(c==')'){
                    while(!stack.isEmpty() && !stack.peek().equals("(")){
                        postfix.append(stack.peek());
                        postfixStack.push(stack.pop());
                    }
                    stack.pop();
                } else{
                    while(!stack.isEmpty()&& precedence(stack.peek())>=precedence(String.valueOf(c))){
                        postfix.append(stack.peek());
                        postfixStack.push(stack.pop());
                    }
                    stack.push(String.valueOf(c));
                }

            }

            while(!stack.isEmpty()){
                postfix.append(stack.peek());
                postfixStack.push(stack.pop());
            }

//            System.out.println(stack);
//            System.out.println(postfix);
//            System.out.println(postfixStack);
//            System.out.println(doCalculation(postfixStack));

        return postfixStack;
    }
    public static int precedence(String s){
        return switch (s){
            case "^" -> 3;
            case "*", "/" -> 2;
            case "+", "-" -> 1;
            default -> -1;
        };
    }

    public static String[] extractDigit(char[] arr, int position){
        StringBuilder extractedDigit = new StringBuilder();
//        System.out.println("----------");
        for(int i=position; i<arr.length; i++){
            if(Character.isDigit(arr[i])){
                extractedDigit.append(arr[i]);
                position++;
            } else{
                break;
            }
        }
//        System.out.println(extractedDigit);
//        System.out.println(position);
//        System.out.println("----------");
        return new String[]{String.valueOf(extractedDigit), String.valueOf(position-1)};
    }
    public static String doCalculation(Stack<String> postfixStack){
        String[] arr = postfixStack.toArray(new String[0]);
        List<String> list = new ArrayList<>(List.of(arr));
        float result = 0.0f;
        System.out.println(list);

        int i=0;
        while(list.size()!=1){
            String s = list.get(i);
            if(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/")){
                float x = Float.parseFloat(list.get(i-2));
                float y = Float.parseFloat(list.get(i-1));
                result = switch (s){
                    case "+"->x+y;
                    case "-"->x-y;
                    case "*"->x*y;
                    case "/"->x/y;
                    default -> 0.0f;
                };
                list.remove(i);
                list.add(i, String.valueOf(result));
                list.remove(i-1);
                list.remove(i-2);
                i=0;
            } else{
                i++;
            }

        }
        return String.valueOf(result);
    }
}
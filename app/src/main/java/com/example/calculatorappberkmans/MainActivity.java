package com.example.calculatorappberkmans;

import static java.lang.Integer.parseInt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View v){
        TextView Output = findViewById(R.id.textViewOutput);
        TextView Previous = findViewById(R.id.textViewPrevious);
        TextView PreviousDisplay = findViewById(R.id.textViewPreviousDisplay);
        Previous.setText(Output.getText().toString());
        String Equation = "";
        int CurId = v.getId();
        if(CurId == R.id.button1){
            Equation = "1";
            Output.setText(Previous.getText()+Equation);
            Previous.setText("");
        }
        else if(CurId == R.id.button2){
            Equation = "2";
            Output.setText(Previous.getText()+Equation);
            Previous.setText("");
        }
        else if(CurId == R.id.button3){
            Equation = "3";
            Output.setText(Previous.getText()+Equation);
            Previous.setText("");
        }
        else if(CurId == R.id.button4){
            Equation = "4";
            Output.setText(Previous.getText()+Equation);
            Previous.setText("");
        }
        else if(CurId == R.id.button5){
            Equation = "5";
            Output.setText(Previous.getText()+Equation);
            Previous.setText("");
        }
        else if(CurId == R.id.button6){
            Equation = "6";
            Output.setText(Previous.getText()+Equation);
            Previous.setText("");
        }
        else if(CurId == R.id.button7){
            Equation = "7";
            Output.setText(Previous.getText()+Equation);
            Previous.setText("");
        }
        else if(CurId == R.id.button8){
            Equation = "8";
            Output.setText(Previous.getText()+Equation);
            Previous.setText("");
        }
        else if(CurId == R.id.button9){
            Equation = "9";
            Output.setText(Previous.getText()+Equation);
            Previous.setText("");
        }
        else if(CurId == R.id.buttonDecimal){
            Equation = ".";
            Output.setText(Previous.getText()+Equation);
            Previous.setText("");
        }


        //"Modifiers"
        else if(CurId == R.id.buttonPlus){
            Equation = "+";
            Output.setText(Previous.getText()+Equation);
            Previous.setText("");
        }
        else if(CurId == R.id.buttonSubtract){
            Equation = "-";
            Output.setText(Previous.getText()+Equation);
            Previous.setText("");
        }
        else if(CurId == R.id.buttonMultiply){
            Equation = "*";
            Output.setText(Previous.getText()+Equation);
            Previous.setText("");
        }
        else if(CurId == R.id.buttonDivide){
            Equation = "/";
            Output.setText(Previous.getText()+Equation);
            Previous.setText("");
        }
        else if(CurId == R.id.buttonPlusMinus){
            Equation = "$";
            Output.setText(Previous.getText()+Equation);
            Previous.setText("");
        }
        else if(CurId == R.id.buttonSquare){
            Equation = "^2";
            Output.setText(Previous.getText()+Equation);
            Previous.setText("");
        }



        else if(CurId == R.id.buttonPlusMinus){
            Equation = " $ ";
            Output.setText(Previous.getText()+Equation);
            Previous.setText("");
        }
        else if(CurId == R.id.buttonEqual){
            PreviousDisplay.setText(Output.getText().toString());
            Output.setText("");
            Previous.setText("");
            Equation = calculateAnswer(PreviousDisplay.getText().toString());
            Output.setText(Previous.getText()+Equation);

        }
    }
    public String calculateAnswer(String input){
        String mod = "";
        int modLocation = 0;
        int num1 = 0;
        int num2 = 0;
        int solution = 0;
        if(input.contains("*")){
            modLocation = input.indexOf("*");
            mod = "*";
        } else if (input.contains("/")) {
            modLocation = input.indexOf("/");
            mod = "/";

        }
        else if (input.contains("+")) {
            modLocation = input.indexOf("+");
            mod = "+";
        }
        else if (input.contains("-")) {
            modLocation = input.indexOf("-");
            mod = "-";
        }
        else if (input.contains("^2")) {
            modLocation = input.indexOf("^2");
            mod = "^2";
        }

        num1 = parseInt(input.substring(0,modLocation));
        num2 = parseInt(input.substring(modLocation+1,input.length()-1));

        if(mod == "*"){
            solution = num1*num2;
        }
        return solution;
    }

}
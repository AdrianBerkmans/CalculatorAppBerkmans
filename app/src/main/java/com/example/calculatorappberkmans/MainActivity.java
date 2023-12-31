package com.example.calculatorappberkmans;

import static java.lang.Double.parseDouble;
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
    String lastPress = "";
    Boolean isNeg = false;
    public void onClick(View v){
        TextView Output = findViewById(R.id.textViewOutput);
        TextView Previous = findViewById(R.id.textViewPrevious);
        TextView PreviousDisplay = findViewById(R.id.textViewPreviousDisplay);
        Previous.setText(Output.getText().toString());
        String Equation = "";
        try{if(lastPress=="eq"){
            PreviousDisplay.setText(Output.getText());
            Previous.setText("");
            Output.setText("");
        }
            int CurId = v.getId();
            if(CurId == R.id.buttonClear){
                Output.setText("");
                PreviousDisplay.setText("");
            }
            else if(CurId == R.id.buttonZero){
                Equation = "0";
                Output.setText(Previous.getText()+Equation);
                Previous.setText("");
                lastPress = "num";
            }
            else if(CurId == R.id.button1){
                Equation = "1";
                Output.setText(Previous.getText()+Equation);
                Previous.setText("");
                lastPress = "num";
            }
            else if(CurId == R.id.button2){
                Equation = "2";
                Output.setText(Previous.getText()+Equation);
                Previous.setText("");
                lastPress = "num";
            }
            else if(CurId == R.id.button3){
                Equation = "3";
                Output.setText(Previous.getText()+Equation);
                Previous.setText("");
                lastPress = "num";
            }
            else if(CurId == R.id.button4){
                Equation = "4";
                Output.setText(Previous.getText()+Equation);
                Previous.setText("");
                lastPress = "num";
            }
            else if(CurId == R.id.button5){
                Equation = "5";
                Output.setText(Previous.getText()+Equation);
                Previous.setText("");
                lastPress = "num";
            }
            else if(CurId == R.id.button6){
                Equation = "6";
                Output.setText(Previous.getText()+Equation);
                Previous.setText("");
                lastPress = "num";
            }
            else if(CurId == R.id.button7){
                Equation = "7";
                Output.setText(Previous.getText()+Equation);
                Previous.setText("");
                lastPress = "num";
            }
            else if(CurId == R.id.button8){
                Equation = "8";
                Output.setText(Previous.getText()+Equation);
                Previous.setText("");
                lastPress = "num";
            }
            else if(CurId == R.id.button9){
                Equation = "9";
                Output.setText(Previous.getText()+Equation);
                Previous.setText("");
                lastPress = "num";
            }
            else if(CurId == R.id.buttonDecimal){
                Equation = ".";
                Output.setText(Previous.getText()+Equation);
                Previous.setText("");
                lastPress = "num";
            }

            else if(CurId == R.id.buttonEqual){
                PreviousDisplay.setText(Output.getText().toString());
                Output.setText("");
                Previous.setText("");
                Equation = calculateAnswer(PreviousDisplay.getText().toString());
                Output.setText(Previous.getText()+Equation);
                lastPress = "eq";

            }
            else if(CurId == R.id.buttonBackspace){
                Output.setText(Output.getText().toString().substring(0,Output.length()-1));
                lastPress = "num";
            }

            //"Modifiers"
            if(!(Output.getText().toString().contains("/")||Output.getText().toString().contains("*")||Output.getText().toString().contains("+")||Output.getText().toString().contains("-")||Output.getText().toString().contains("^"))){
                if(CurId == R.id.buttonPlus){
                    Equation = "+";
                    Output.setText(Previous.getText()+Equation);
                    Previous.setText("");
                    lastPress = "opp";
                }
                else if(CurId == R.id.buttonSubtract){
                    Equation = "-";
                    Output.setText(Previous.getText()+Equation);
                    Previous.setText("");
                    lastPress = "opp";
                }
                else if(CurId == R.id.buttonMultiply){
                    Equation = "*";
                    Output.setText(Previous.getText()+Equation);
                    Previous.setText("");
                    lastPress = "opp";
                }
                else if(CurId == R.id.buttonDivide){
                    Equation = "/";
                    Output.setText(Previous.getText()+Equation);
                    Previous.setText("");
                    lastPress = "opp";
                }
                else if(CurId == R.id.buttonSquare){
                    Equation = "^2";
                    Output.setText(Previous.getText()+Equation);
                    Previous.setText("");
                    lastPress = "opp";
                }
                else if(CurId == R.id.buttonExponent){
                    Equation = "^";
                    Output.setText(Previous.getText()+Equation);
                    Previous.setText("");
                    lastPress = "opp";

                }
            }
        }
        catch(Exception e){
            Output.setText("NaN");
            PreviousDisplay.setText("");
            Previous.setText("");
        }

    }
    public String calculateAnswer(String input){
        String mod = "";
        int modLocation = 0;
        Double num1 = 0.0;
        Double num2 = 0.0;
        double solution = 0.0;
        if (input.contains("^2")) {
            modLocation = input.indexOf("^2");
            double result = parseDouble(input.substring(0,modLocation));
            result = result*result;
            if(modLocation<input.length()-2){return "NaN";}
            return result+"";
        }
        else if (input.length()<3 &&(input.contains("/")||input.contains("*")||input.contains("+")||input.contains("-"))){
            return "NaN";
        }
        else if(input.contains("*")){
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
        }else if (input.contains("^")) {
            modLocation = input.indexOf("^");
            mod = "^";
        }
        else{return input;}

        num1 = parseDouble(input.substring(0,modLocation));
        num2 = parseDouble(input.substring(modLocation+1,input.length()));

        if(mod == "*"){
            solution = num1*num2;
        }
        if(mod == "/"){
            solution = num1/num2;
        }
        if(mod == "+"){
            solution = num1+num2;
        }
        if(mod == "-"){
            solution = num1-num2;
        }
        if(mod == "^"){
            solution = Math.pow(num1,num2);
        }
        int result1 = (int)solution;

        if((double)result1 == solution){
            return Integer.toString(result1);
        }
        return Double.toString(solution);
    }

}
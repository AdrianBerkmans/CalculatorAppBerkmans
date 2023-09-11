package com.example.calculatorappberkmans;

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
        Previous.setText(Output.getText());
        String Equation = "";
        int CurId = v.getId();
        if(CurId == R.id.button1){
            Equation = "1";
        }
        else if(CurId == R.id.button2){
            Equation = "2";
        }
        else if(CurId == R.id.button3){
            Equation = "3";
        }
        else if(CurId == R.id.button4){
            Equation = "4";
        }
        else if(CurId == R.id.button5){
            Equation = "5";
        }
        else if(CurId == R.id.button6){
            Equation = "6";
        }
        else if(CurId == R.id.button7){
            Equation = "7";
        }
        else if(CurId == R.id.button8){
            Equation = "8";
        }
        else if(CurId == R.id.button9){
            Equation = "9";
        }
        else if(CurId == R.id.buttonDecimal){
            Equation = ".";
        }
        else if(CurId == R.id.buttonEqual){

        }

        Output.setText(Previous.getText()+Equation);
    }

}
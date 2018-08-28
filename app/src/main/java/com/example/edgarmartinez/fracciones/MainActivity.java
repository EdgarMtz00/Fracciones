package com.example.edgarmartinez.fracciones;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static java.lang.Integer.parseInt;

public class MainActivity extends AppCompatActivity {
    public EditText Num1, Num2, NumR, Den1, Den2, DenR;
    public Button Suma, Resta, Multiplicacion, Division;
    public int num, den;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Num1 = (EditText)findViewById(R.id.etNum1);
        Num2 = (EditText)findViewById(R.id.etNum2);
        NumR = (EditText)findViewById(R.id.etNumR);
        Den1 = (EditText)findViewById(R.id.etDen1);
        Den2 = (EditText)findViewById(R.id.etDen2);
        DenR = (EditText)findViewById(R.id.etDenR);
        Suma = (Button) findViewById(R.id.btnSuma);
        Resta = (Button) findViewById(R.id.btnResta);
        Division = (Button) findViewById(R.id.btnDivision);
        Multiplicacion = (Button) findViewById(R.id.btnMultiplicacion);
    }
    public void sumaClick(View p){
        fraccion res = new fraccion(parseInt(Num1.getText().toString()),parseInt(Den1.getText().toString())).sumar(new fraccion(parseInt(Num2.getText().toString()),parseInt(Den2.getText().toString())));
        NumR.setText("" + res.num);
        if(res.num!=0){
            DenR.setText("" + res.den);
        }
    }

    public void restaClick(View p){
        fraccion res =new fraccion(parseInt(Num1.getText().toString()),parseInt(Den1.getText().toString())).restar(new fraccion(parseInt(Num2.getText().toString()),parseInt(Den2.getText().toString())));
        NumR.setText("" + res.num);
        if(res.num!=0){
            DenR.setText("" + res.den);
        }
    }

    public void multClick(View p){
        fraccion res =new fraccion(parseInt(Num1.getText().toString()),parseInt(Den1.getText().toString())).multiplicar(new fraccion(parseInt(Num2.getText().toString()),parseInt(Den2.getText().toString())));
        NumR.setText("" + res.num);
        if(res.num!=0){
            DenR.setText("" + res.den);
        }
    }

    public void divClick(View p){
        fraccion res =new fraccion(parseInt(Num1.getText().toString()),parseInt(Den1.getText().toString())).division(new fraccion(parseInt(Num2.getText().toString()),parseInt(Den2.getText().toString())));
        NumR.setText("" + res.num);
        if(res.num!=0){
        DenR.setText("" + res.den);
        }
    }


}

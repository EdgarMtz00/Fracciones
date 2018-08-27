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

        String texto = Num1.getText().toString();
        int num1 = parseInt(texto);

        texto = Den1.getText().toString();
        int den1 = parseInt(texto);

        texto = Num2.getText().toString();
        int num2 = parseInt(texto);

        texto = Den2.getText().toString();
        int den2 = parseInt(texto);
        if( den1 == 0 || den2 == 0){
            NumR.setText("ERROR");
            DenR.setText("ERROR");
        }else {
            NumR.setText("" + ((num1 * den2) + (num2 * den1)));
            DenR.setText("" + (den1 * den2));
        }
    }

    public void restaClick(View p){
        String texto = Num1.getText().toString();
        int num1 = parseInt(texto);

        texto = Den1.getText().toString();
        int den1 = parseInt(texto);

        texto = Num2.getText().toString();
        int num2 = parseInt(texto);

        texto = Den2.getText().toString();
        int den2 = parseInt(texto);
        if( den1 == 0 || den2 == 0){
            NumR.setText("ERROR");
            DenR.setText("ERROR");
        }else {
            NumR.setText("" + ((num1 * den2) - (num2 * den1)));
            DenR.setText("" + (den1 * den2));
        }
    }

    public void multClick(View p){
        String texto = Num1.getText().toString();
        int num1 = parseInt(texto);

        texto = Den1.getText().toString();
        int den1 = parseInt(texto);

        texto = Num2.getText().toString();
        int num2 = parseInt(texto);

        texto = Den2.getText().toString();
        int den2 = parseInt(texto);
        if( den1 == 0 || den2 == 0){
            NumR.setText("ERROR");
            DenR.setText("ERROR");
        }else {
            NumR.setText("" + (num1 * num2));
            DenR.setText("" + (den1 * den2));
        }
    }

    public void divClick(View p){
        String texto = Num1.getText().toString();
        int num1 = parseInt(texto);

        texto = Den1.getText().toString();
        int den1 = parseInt(texto);

        texto = Num2.getText().toString();
        int num2 = parseInt(texto);

        texto = Den2.getText().toString();
        int den2 = parseInt(texto);
        if( den1 == 0 || num2 == 0 || den2 == 0){
            NumR.setText("ERROR");
            DenR.setText("ERROR");
        }else {
            NumR.setText("" + (num1 * den2));
            DenR.setText("" + (den1 * num2));
        }
    }

    public void conversion(int num, int den){
        int menor = (num<den)?num:den;
        for(int i=0;i == menor;i++){
            if(num % i == 0 && den % i ==0){
                conversion(num/i,den/i);
                return;
            }
        }

    }
}

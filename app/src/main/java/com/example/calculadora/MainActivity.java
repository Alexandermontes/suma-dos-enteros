package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public TextView titulo, resultado;
    public EditText num1, num2;
    public Button sumar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        titulo = (TextView) findViewById(R.id.tv_titulo);
        num1 = (EditText) findViewById(R.id.et_num1);
        num2 = (EditText) findViewById(R.id.et_num2);
        sumar = (Button) findViewById(R.id.bt_sumar);
        resultado = (TextView) findViewById(R.id.tv_resultado);

    }

    public void suma(View view){
        int var1 = Integer.parseInt(num1.getText().toString());
        int var2 = Integer.parseInt(num1.getText().toString());
        int res = var1 + var2;
        String salida = String.valueOf(res);

        resultado.setText(salida);
    }

}
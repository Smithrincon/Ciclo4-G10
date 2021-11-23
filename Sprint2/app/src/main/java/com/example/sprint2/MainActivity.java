package com.example.sprint2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText peso,altura,nombre,contacto;
    private Button mostrar;
    private TextView imc, resultado,datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombre=findViewById(R.id.nombre);
        contacto=findViewById(R.id.contacto);
        peso = findViewById(R.id.txtpeso);
        altura = findViewById(R.id.txtaltura);
        mostrar = findViewById(R.id.boton);

        imc = findViewById(R.id.imc);
        resultado = findViewById(R.id.descripcion);
        datos = findViewById(R.id.pesoideal);
    }
     public void operar(View view) {
         double npeso=Double.parseDouble(peso.getText().toString());
         double naltura=Double.parseDouble(altura.getText().toString());
         double resultadoimc= npeso/(naltura+naltura);
         String nnombre=String.format(nombre.getText().toString());
         String ncontacto=String.format(contacto.getText().toString());


         imc.setText("IMC  "+String.format("%.2f ",resultadoimc));
         datos.setText("Nombre: "+nnombre+"  Contacto:  "+ncontacto);
         if(resultadoimc<18.5)
             resultado.setText("Bajo Peso");
         else
         if (resultadoimc>=18.5 && resultadoimc<=24.9)
             resultado.setText("Peso normal");
         else
         if (resultadoimc>=25 && resultadoimc<=29.9)
             resultado.setText("Sobrepeso  ");



        }



    }

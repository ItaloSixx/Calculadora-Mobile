package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
        Button bsoma, bsubtracao, bdivisao, bmultiplicacao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            bsoma = findViewById(R.id.soma);
            bsubtracao = findViewById(R.id.subtracao);
            bdivisao = findViewById(R.id.divisao);
            bmultiplicacao = findViewById(R.id.multiplicacao);


        bsoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent redirect =  new Intent(MainActivity.this, ActivitySoma.class);
                startActivity(redirect);
            }
        });

        bsubtracao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent redirect = new Intent(MainActivity.this, ActivitySubtracao.class);
                startActivity(redirect);
            }
        });

        bdivisao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent redirect = new Intent(MainActivity.this, ActivityDivisao.class);
                startActivity(redirect);
            }
        });
        bmultiplicacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent redirect = new Intent(MainActivity.this, ActivityMultiplicacao.class);
                startActivity(redirect);
            }
        });
    }
}
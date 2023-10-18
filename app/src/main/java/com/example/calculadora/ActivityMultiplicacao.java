package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityMultiplicacao extends AppCompatActivity {
        EditText numero1, numero2;
        Button igual;
        TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplicacao);
        numero1 = findViewById(R.id.numero1);
        numero2 = findViewById(R.id.numero2);
        igual = findViewById(R.id.igual);
        resultado = findViewById(R.id.resultado);

        igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textoNumero1 = numero1.getText().toString();
                String textoNumero2 = numero2.getText().toString();
                if (!textoNumero1.isEmpty() && !textoNumero2.isEmpty()){
                    float valorNumero1 = Float.parseFloat(textoNumero1);
                    float valorNumero2 = Float.parseFloat(textoNumero2);
                    float resultadoMultiplicacao = valorNumero1 * valorNumero2;
                    resultado.setText("" + resultadoMultiplicacao);
                }else{
                    Toast.makeText(getApplicationContext(), "Preencha ambos os campos", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
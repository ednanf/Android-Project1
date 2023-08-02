package com.ednan.projeto1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    // main method
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // functions
    @SuppressLint("SetTextI18n")
    public void selecionarBotao(View view) {

        int numero = new Random().nextInt(11);

        TextView texto = findViewById(R.id.textoResultado); // creates a representation of the object with a specified id
        texto.setText("O número sorteado foi: " + numero);

    }

}
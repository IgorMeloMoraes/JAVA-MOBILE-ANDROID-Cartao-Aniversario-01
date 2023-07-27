package com.example.cartaodeaniversario;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Metodo de click que retorna uma mensagem caso o usuario clicar na imagem
    @SuppressLint("SetTextI18n")
    public void clickCard(View view){
        // Variavel que retorna uma string com o nome que será inserido na msg.
        // Essa nome e a escolha da msg poderão ser inseridos pelo usuario em um projeto futuro, no momento é uma string fixa para treinamento de metodos
        String nome = "Igor";

        // Retorno do objeto TextView para modifica-lo.
        TextView msgAniversario = findViewById(R.id.txt_frase_parabéns);
        msgAniversario.setText("Olha que dia mais feliz, é o seu dia!! Gostariamos de parabenizar você nesse grande dia\n Feliz Aniversário " + nome);
    }
}
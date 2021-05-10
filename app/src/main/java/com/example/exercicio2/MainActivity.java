package com.example.exercicio2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText nome = findViewById(R.id.nome);
        EditText sobrenome = findViewById(R.id.sobrenome);
        btn = findViewById(R.id.button);
        TextView mensagem = findViewById(R.id.mensagem);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String text = "Olá ";

                if(nome.getText().toString().equals("") && sobrenome.getText().toString().equals(""))
                        mensagem.setText("Nome não inserido");
                else
                {
                    if(sobrenome.getText().toString().equals(""))
                        mensagem.setText(text + nome.getText().toString());
                    else
                        if(nome.getText().toString().equals(""))
                            mensagem.setText(text + sobrenome.getText().toString());
                        else
                            mensagem.setText(text + nome.getText().toString() + " " + sobrenome.getText().toString());

                }


            }
        });
    }
}
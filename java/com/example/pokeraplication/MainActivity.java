package com.example.pokeraplication;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class MainActivity extends AppCompatActivity {

    FloatingActionButton fabAudio;
    boolean audioLigado = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        fabAudio = findViewById(R.id.floatingActionButton);


        fabAudio.setOnClickListener(v -> {
            if (audioLigado) {
                fabAudio.setImageResource(R.drawable.audiosim); // muda ícone
                // aqui você pausa ou muta o áudio
            } else {
                fabAudio.setImageResource(R.drawable.audionao); // volta ícone
                // aqui você toca ou desmuta o áudio
            }audioLigado = !audioLigado;

        });
    }

};


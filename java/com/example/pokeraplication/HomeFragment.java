package com.example.pokeraplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class HomeFragment extends Fragment {

    private FloatingActionButton fabAudio;
    private boolean audioLigado = true;

    @Nullable
    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater,
            @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState
    ) {

        View view = inflater.inflate(R.layout.fragmenthome, container, false);

        // FAB de áudio
        fabAudio = view.findViewById(R.id.floatingActionButton);

        fabAudio.setOnClickListener(v -> {
            if (audioLigado) {
                fabAudio.setImageResource(R.drawable.audiosim);
                // pausar / mutar áudio
            } else {
                fabAudio.setImageResource(R.drawable.audionao);
                // tocar / desmutar áudio
            }
            audioLigado = !audioLigado;
        });

        // Botão START (troca de tela com animação)
        View btnStart = view.findViewById(R.id.button2);
        btnStart.setOnClickListener(v ->
                NavHostFragment.findNavController(HomeFragment.this)
                        .navigate(R.id.action_home_to_segunda)
        );

        return view;
    }
}
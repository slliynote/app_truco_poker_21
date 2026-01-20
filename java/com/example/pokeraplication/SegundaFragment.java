package com.example.pokeraplication;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class SegundaFragment extends Fragment {

    public SegundaFragment() {
        // Construtor vazio obrigatório
    }

    @Nullable
    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater,
            @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState
    ) {
        // Inflando o layout do Fragment
        View root = inflater.inflate(R.layout.segundatelastart, container, false);

        // Pegando a ImageView dentro do layout inflado
        ImageView imgBotao = root.findViewById(R.id.btnCarta1);

        // Adicionando o clique
        imgBotao.setOnClickListener(v -> {
            Log.d("TESTE", "Imagem clicada");
        });

        // Retorna a view inflada
        return root;
    }
}

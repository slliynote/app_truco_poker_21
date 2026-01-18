package com.example.pokeraplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class SegundaFragment extends Fragment {

    public SegundaFragment() {
        // construtor vazio obrigatório
    }

    @Nullable
    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater,
            @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState
    ) {
        // AQUI você liga o Fragment ao XML
        return inflater.inflate(R.layout.segundatelastart, container, false);
    }
}
package com.example.pokeraplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pokeraplication.Adapter.CartaAdapter;
import com.example.pokeraplication.R;

import java.util.ArrayList;
import java.util.List;

public class SegundaFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater,
            @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState
    ) {
        View view = inflater.inflate(R.layout.segundatelastart, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.recyclerCartas);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));

        // 🔥 LISTA DE CARTAS (adicione quantas quiser)
        List<Integer> cartas = new ArrayList<>();
        cartas.add(R.drawable.selecaotruco);
        cartas.add(R.drawable.bitmap);
        cartas.add(R.drawable.selecaoburaco);
        cartas.add(R.drawable.mamau);
        cartas.add(R.drawable.selecaosueca);
        cartas.add(R.drawable.bitmark21);

        CartaAdapter adapter = new CartaAdapter(cartas);
        recyclerView.setAdapter(adapter);

        return view;
    }
}

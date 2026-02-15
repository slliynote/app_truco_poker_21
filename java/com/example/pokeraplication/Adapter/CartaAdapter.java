package com.example.pokeraplication.Adapter;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pokeraplication.R;

import java.util.List;


public class CartaAdapter extends RecyclerView.Adapter<CartaAdapter.CartaViewHolder> {

    private List<Integer> cartas;

    // 🔥 ESSE CONSTRUTOR É O QUE ESTAVA FALTANDO
    public CartaAdapter(List<Integer> cartas) {
        this.cartas = cartas;
    }

    @NonNull
    @Override
    public CartaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_carta, parent, false);
        return new CartaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CartaViewHolder holder, int position) {
        holder.imgCarta.setImageResource(cartas.get(position));
    }

    @Override
    public int getItemCount() {
        return cartas.size();
    }

    static class CartaViewHolder extends RecyclerView.ViewHolder {

        ImageView imgCarta;

        public CartaViewHolder(@NonNull View itemView) {
            super(itemView);
            imgCarta = itemView.findViewById(R.id.imgCarta);
        }
    }
}
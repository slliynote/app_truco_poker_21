package com.example.pokeraplication;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pokeraplication.Adapter.CartaAdapter;
import com.example.pokeraplication.Adapter.GridSpacingItemDecoration;

import java.util.ArrayList;
import java.util.Arrays;
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

        List<Integer> cartas = new ArrayList<>();
        cartas.add(R.drawable.selecaotruco);
        cartas.add(R.drawable.bitmap);
        cartas.add(R.drawable.selecaoburaco);
        cartas.add(R.drawable.mamau);
        cartas.add(R.drawable.selecaosueca);
        cartas.add(R.drawable.bitmark21);
        cartas.add(R.drawable.pife);
        cartas.add(R.drawable.roubamonte); // corrigido

        CartaAdapter adapter = new CartaAdapter(cartas);
        recyclerView.setAdapter(adapter);

        int spacingDp = 12;
        int spacingPx = Math.round(
                spacingDp * getResources().getDisplayMetrics().density
        );

        recyclerView.addItemDecoration(
                new GridSpacingItemDecoration(2, spacingPx, false)
        );

        adapter.setOnCartaClickListener((view1, imageResId) -> {

            List<String> opcoes = new ArrayList<>();

            if (imageResId == R.drawable.selecaotruco) {
                opcoes = Arrays.asList(
                        "Truco Mineiro",
                        "Truco Paulista",
                        "Truco Gaúcho",
                        "Truco Argentino",
                        "Truco Uruguaio",
                        "Truco Paranaense",
                        "Truco Capixaba",
                        "Truco Paraense"
                );
            }

            else if (imageResId == R.drawable.bitmap) {
                opcoes = Arrays.asList(
                        "Texas Hold'em",
                        "Omaha",
                        "Omaha Hi-Lo",
                        "Five Card Draw",
                        "Seven Card Stud",
                        "Razz",
                        "2-7 Triple Draw"
                );
            }

            else if (imageResId == R.drawable.selecaoburaco) {
                opcoes = Arrays.asList(
                        "Buraco Tradicional",
                        "Buraco Aberto",
                        "Buraco Fechado",
                        "Canastra",
                        "Canastra Real",
                        "Canastrão"
                );
            }

            else if (imageResId == R.drawable.mamau) {
                opcoes = Arrays.asList(
                        "Mau Mau Clássico",
                        "Uno",
                        "Crazy Eights"
                );
            }

            else if (imageResId == R.drawable.selecaosueca) {
                opcoes = Arrays.asList("Sueca");
            }

            else if (imageResId == R.drawable.bitmark21) {
                opcoes = Arrays.asList("21 tradicional");
            }

            else if (imageResId == R.drawable.pife) {
                opcoes = Arrays.asList("Pife");
            }

            else if (imageResId == R.drawable.roubamonte) {
                opcoes = Arrays.asList("Rouba-Monte");
            }

            menu_variacoes(view1, opcoes);
        });

        return view;
    }

    // 🔥 MENU COM CLIQUE FUNCIONANDO
    private void menu_variacoes(View anchor, List<String> options) {

        LayoutInflater inflater = getLayoutInflater();
        View popupView = inflater.inflate(R.layout.menu_variacoes, null);

        LinearLayout container = popupView.findViewById(R.id.menuContainer);

        PopupWindow popup = new PopupWindow(
                popupView,
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT,
                true
        );

        popup.setOutsideTouchable(true);
        popup.setElevation(12f);

        for (String option : options) {

            TextView item = new TextView(requireContext());
            item.setText(option);
            item.setPadding(40, 25, 40, 25);
            item.setTextColor(Color.WHITE);
            item.setTextSize(16f);
            item.setClickable(true);
            item.setFocusable(true);
            item.setBackgroundResource(android.R.drawable.list_selector_background);

            item.setOnClickListener(v -> {

                popup.dismiss();

                requireActivity().getSupportFragmentManager()
                        .beginTransaction()
                        .setCustomAnimations(
                                android.R.anim.slide_in_left,
                                android.R.anim.slide_out_right,
                                android.R.anim.slide_in_left,
                                android.R.anim.slide_out_right
                        )
                        .replace(R.id.nav_host_fragment,
                                GAMEBLANKFragment .newInstance(option))
                        .addToBackStack(null)
                        .commit();
            });

            container.addView(item);
        }

        popupView.measure(
                View.MeasureSpec.UNSPECIFIED,
                View.MeasureSpec.UNSPECIFIED
        );

        int popupWidth = popupView.getMeasuredWidth();
        int popupHeight = popupView.getMeasuredHeight();

        int[] location = new int[2];
        anchor.getLocationOnScreen(location);

        int screenWidth = Resources.getSystem().getDisplayMetrics().widthPixels;

        int x = location[0];
        int y = location[1] - popupHeight;

        if (x + popupWidth > screenWidth) {
            x = screenWidth - popupWidth - 16;
        }

        if (y < 0) {
            y = location[1] + anchor.getHeight();
        }

        popup.showAtLocation(anchor, Gravity.NO_GRAVITY, x, y);
    }
}
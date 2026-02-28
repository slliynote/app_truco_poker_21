package com.example.pokeraplication;



import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

    public class GAMEBLANKFragment extends Fragment {

        private static final String ARG_GAME_NAME = "game_name";

        public static GAMEBLANKFragment  newInstance(String gameName) {
            GAMEBLANKFragment  fragment = new GAMEBLANKFragment ();
            Bundle args = new Bundle();
            args.putString(ARG_GAME_NAME, gameName);
            fragment.setArguments(args);
            return fragment;
        }

        @Nullable
        @Override
        public View onCreateView(
                @NonNull LayoutInflater inflater,
                @Nullable ViewGroup container,
                @Nullable Bundle savedInstanceState
        ) {
            View view = inflater.inflate(R.layout.fragment_game_blank, container, false);

            TextView title = view.findViewById(R.id.gameTitle);

            if (getArguments() != null) {
                String name = getArguments().getString(ARG_GAME_NAME);
                title.setText(name);
            }

            return view;
        }
    }


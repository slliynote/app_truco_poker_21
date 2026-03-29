package com.example.pokeraplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class OnboardingPageFragment extends Fragment {

    private static final String ARG_BG = "bg";
    private static final String ARG_CENTER = "center";
    private static final String ARG_TITLE = "title";
    private static final String ARG_DESC = "desc";

    public static OnboardingPageFragment newInstance(
            int bgImage,
            int centerImage,
            String title,
            String desc
    ) {

        OnboardingPageFragment fragment = new OnboardingPageFragment();

        Bundle args = new Bundle();
        args.putInt(ARG_BG, bgImage);
        args.putInt(ARG_CENTER, centerImage);
        args.putString(ARG_TITLE, title);
        args.putString(ARG_DESC, desc);

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(
                R.layout.fragment_onboarding_page,
                container,
                false
        );

        ImageView bgImage = view.findViewById(R.id.bgImage);
        ImageView centerImage = view.findViewById(R.id.centerImage);
        TextView titleView = view.findViewById(R.id.title);
        TextView descView = view.findViewById(R.id.desc);

        if (getArguments() != null) {

            bgImage.setImageResource(getArguments().getInt(ARG_BG));
            centerImage.setImageResource(getArguments().getInt(ARG_CENTER));

            titleView.setText(getArguments().getString(ARG_TITLE));
            descView.setText(getArguments().getString(ARG_DESC));
        }

        return view;
    }
}
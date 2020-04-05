package com.example.lab6fragment;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class LeftFragment extends Fragment implements View.OnClickListener {

    private OnColorButtonListener onColorButtonListener;

    public LeftFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach((context));
        onColorButtonListener=(OnColorButtonListener) context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_left, container, false);
        view.findViewById(R.id.fr_red).setOnClickListener(this);
        view.findViewById(R.id.fr_yellow).setOnClickListener(this);
        view.findViewById(R.id.fr_green).setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.fr_red:
                onColorButtonListener.onColorClick(0);
                break;
            case R.id.fr_yellow:
                onColorButtonListener.onColorClick(1);
                break;
            case R.id.fr_green:
                onColorButtonListener.onColorClick(2);
                break;
        }
    }
}

package com.zulfikar.belajarbahasainggris.Fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.zulfikar.belajarbahasainggris.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Soal1Fragment extends Fragment {


    public Soal1Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_soal1, container, false);
    }

}
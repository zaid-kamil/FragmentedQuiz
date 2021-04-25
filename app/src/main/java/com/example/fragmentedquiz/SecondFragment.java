package com.example.fragmentedquiz;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.fragmentedquiz.databinding.FragmentSecondBinding;

public class SecondFragment extends Fragment {


    private FragmentSecondBinding bind;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        bind = FragmentSecondBinding.bind(view);
        // receive data
        SecondFragmentArgs args = SecondFragmentArgs.fromBundle(getArguments());
        bind.textPlayerName.setText(args.getName());

    }
}
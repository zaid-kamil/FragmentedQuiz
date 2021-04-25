package com.example.fragmentedquiz;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fragmentedquiz.databinding.FragmentQ1Binding;

public class Q1Fragment extends Fragment {

    private FragmentQ1Binding bind;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_q1, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        bind = FragmentQ1Binding.bind(view);
        Q1FragmentArgs arg = Q1FragmentArgs.fromBundle(getArguments());
        bind.textPlayer.setText(arg.getName());

        bind.btnq1.setOnClickListener(view1 -> {
            int selID = bind.radioQ1.getCheckedRadioButtonId();
            switch (selID){
                case R.id.r2:
                    Q1FragmentDirections.ActionQ1FragmentToQ2Fragment dir = Q1FragmentDirections.actionQ1FragmentToQ2Fragment();
                    dir.setName(arg.getName());
                    dir.setScore(10);
                    NavHostFragment.findNavController(this).navigate(dir);
                    break;
                default:
                    Q1FragmentDirections.ActionQ1FragmentToGameOverFragment dir2 = Q1FragmentDirections.actionQ1FragmentToGameOverFragment();
                    dir2.setName(arg.getName());
                    dir2.setScore(0);
                    NavHostFragment.findNavController(this).navigate(dir2);
            }
        });
    }
}
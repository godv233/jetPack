package com.example.jetpack.navigation;

import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jetpack.R;

/**
 * 1.entity
 * 2.dao
 * 3.database
 */
public class JayFragment extends Fragment {

    private JayViewModel mViewModel;

    public static JayFragment newInstance() {
        return new JayFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.jay_fragment, container, false);
        return view;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(JayViewModel.class);
        // TODO: Use the ViewModel
    }

}

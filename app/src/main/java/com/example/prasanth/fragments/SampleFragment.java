package com.example.prasanth.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.prasanth.fragments_using_bundle.R;

public class SampleFragment extends Fragment {
    private TextView nameTextView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sample, container, false);
        nameTextView = (TextView) view.findViewById(R.id.fragmentTextView);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Bundle bundle = getArguments();

        if (bundle != null) {
            String name = bundle.getString("name", "No data");
            nameTextView.setText(name);
        } else {
            nameTextView.setText("Bundle data null");
        }
    }
}

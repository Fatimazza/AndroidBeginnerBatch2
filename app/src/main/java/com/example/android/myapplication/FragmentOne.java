package com.example.android.myapplication;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by fatimazza on 7/13/17.
 */

public class FragmentOne extends Fragment {

    EditText etFragment1;
    Button button;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
        Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_one, container, false);

        etFragment1 = (EditText) view.findViewById(R.id.etFragment1);

        button = (Button) view.findViewById(R.id.btnFragment1);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getActivity().getApplicationContext(),
                    etFragment1.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}

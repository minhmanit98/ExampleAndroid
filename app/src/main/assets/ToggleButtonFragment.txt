package com.man.android.exampleandroid.Fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.man.android.exampleandroid.R;

public class ToggleButtonFragment extends Fragment {
    private ToggleButton toggleButton1, toggleButton2;
    private Button btnDisplay;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.togglebuttonfragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        toggleButton1 = (ToggleButton) view.findViewById(R.id.toggleButton1);
        toggleButton2 = (ToggleButton) view.findViewById(R.id.toggleButton2);
        btnDisplay = (Button) view.findViewById(R.id.btnDisplay);

        btnDisplay.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                StringBuffer result = new StringBuffer();
                result.append("toggleButton1 : ").append(toggleButton1.getText());
                result.append("\ntoggleButton2 : ").append(toggleButton2.getText());

                Toast.makeText(getContext(), result.toString(),
                        Toast.LENGTH_SHORT).show();

            }

        });
    }
}

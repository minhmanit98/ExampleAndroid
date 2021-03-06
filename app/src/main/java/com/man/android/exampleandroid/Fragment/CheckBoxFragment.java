package com.man.android.exampleandroid.Fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import com.man.android.exampleandroid.R;

public class CheckBoxFragment extends Fragment {
    private CheckBox chkIos, chkAndroid, chkWindows;
    private Button btnDisplay;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.checkboxfragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //addListenerOnChkIos
        chkIos = (CheckBox) view.findViewById(R.id.chkIos);

        chkIos.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //is chkIos checked?
                if (((CheckBox) v).isChecked()) {
                    Toast.makeText(getContext(),
                            "Bro, try Android :)", Toast.LENGTH_SHORT).show();
                }

            }
        });

        //addListenerOnButton
        chkIos = (CheckBox) view.findViewById(R.id.chkIos);
        chkAndroid = (CheckBox) view.findViewById(R.id.chkAndroid);
        chkWindows = (CheckBox) view.findViewById(R.id.chkWindows);
        btnDisplay = (Button) view.findViewById(R.id.btnDisplay);

        btnDisplay.setOnClickListener(new View.OnClickListener() {

            //Run when button is clicked
            @Override
            public void onClick(View v) {

                StringBuffer result = new StringBuffer();
                result.append("IPhone check : ").append(chkIos.isChecked());
                result.append("\nAndroid check : ").append(chkAndroid.isChecked());
                result.append("\nWindows Mobile check :").append(chkWindows.isChecked());

                Toast.makeText(getContext(), result.toString(),
                        Toast.LENGTH_SHORT).show();

            }
        });
    }

}

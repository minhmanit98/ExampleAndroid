package com.man.android.exampleandroid.Fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;


import com.man.android.exampleandroid.R;

import static com.man.android.exampleandroid.MainActivity.selected;


public class ShowCodeFragment extends Fragment {
    Button btcode1;
    Button btxml1;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.showcodefragment, container, false);


    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        switch (selected){
            case 0: break;
            case 1:  break;
            case 2: break;
            case 3: break;
            case 4:  break;
            case 5:  break;
            case 6:  break;
            case 7:break;
            case 100: break;
            default:  break;
        }
        btcode1= (Button) view.findViewById(R.id.btcode1);

        btxml1= (Button) view.findViewById(R.id.btxml1);

        btcode1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {



            }

        });

        btxml1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {



            }

        });

    }

}

package com.man.android.exampleandroid.Fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AnalogClock;
import android.widget.Button;
import android.widget.DigitalClock;
import android.widget.Toast;

import com.man.android.exampleandroid.R;

public class AnalogAndDigitalClockFragment extends Fragment {
    Button button;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.analoganddigitalclockfragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        AnalogClock ac = (AnalogClock) view.findViewById(R.id.analogClock1);
        //what can i do with AnalogClock?

        DigitalClock dc = (DigitalClock) view.findViewById(R.id.digitalClock1);
        //what can i do with DigitalClock also? for display only
    }
}

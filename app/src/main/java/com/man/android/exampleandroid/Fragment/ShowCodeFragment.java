package com.man.android.exampleandroid.Fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.man.android.exampleandroid.R;

import java.io.InputStream;

import static com.man.android.exampleandroid.MainActivity.selected;


public class ShowCodeFragment extends Fragment {
    Button btcode1;
    Button btxml1;
    String codetxt;
    String xmltxt;
    TextView tvShowCode;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.showcodefragment, container, false);


    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);





        switch (selected){
            case 0: codetxt="ButtonFragment.txt"; xmltxt="buttonfragment_xml.txt"; break;
            case 1: codetxt="TextBoxFragment.txt"; xmltxt="textboxfragment_xml.txt"; break;
            case 2: codetxt="PasswordFragment.txt"; xmltxt="passwordfragment_xml.txt"; break;
            case 3: codetxt="CheckBoxFragment.txt"; xmltxt="checkboxfragment_xml.txt"; break;
            case 4: codetxt="ListViewFragment.txt"; xmltxt="listviewfragment_xml.txt"; break;
            case 5: codetxt="RadioButtonFragment.txt"; xmltxt="radiobuttonfragment_xml.txt"; break;
            case 6: codetxt="ToggleButtonFragment.txt"; xmltxt="togglebuttonfragment_xml.txt"; break;
            case 7: codetxt="RatingBarFragment.txt"; xmltxt="ratingbarfragment_xml.txt"; break;
            case 8: codetxt="SpinnerFragment.txt"; xmltxt="spinnerfragment_xml.txt"; break;
            case 9: codetxt="DatePickerFragment.txt"; xmltxt="datepickerfragment_xml.txt"; break;
            case 10: codetxt="TimePickerFragment.txt"; xmltxt="timepickerfragment_xml.txt"; break;
            case 11: codetxt="AnalogAndDigitalClockFragment.txt"; xmltxt="analoganddigitalclockfragment_xml.txt"; break;
            case 12: codetxt="ProcessBarFragment.txt"; xmltxt="processbarfragment_xml.txt"; break;
            case 13: codetxt="AlartDialogFragment.txt"; xmltxt="alartdialogfragment_xml.txt"; break;
            case 14: codetxt="PromptDialogFragment.txt"; xmltxt="promptdialogfragment_xml.txt"; break;
            case 15: codetxt="ToastNotificationFragment.txt"; xmltxt="toastnotificationfragment_xml.txt"; break;
            case 16: codetxt="ImageViewFragment.txt"; xmltxt="imageviewfragment_xml.txt"; break;
            case 17: codetxt="ImageButtonFragment.txt"; xmltxt="imagebuttonfragment_xml.txt"; break;
            case 18: codetxt="LinearLayoutFragment_Vertical.txt"; xmltxt="linearlayoutfragment_vertical_xml.txt"; break;
            case 19: codetxt="LinearLayoutFragment_Horizontal.txt"; xmltxt="linearlayoutfragment_horizontal_xml.txt"; break;
            case 20: codetxt="RelativeLayoutFragment.txt"; xmltxt="relativelayoutfragment_xml.txt"; break;
            case 21: codetxt="TableLayoutFragment.txt"; xmltxt="tablelayoutfragment_xml.txt"; break;
            case 22: codetxt="GridViewFragment.txt"; xmltxt="gridviewfragment_xml.txt"; break;
            case 23: codetxt="WebViewFragment.txt"; xmltxt="webviewfragment_xml.txt"; break;
            case 100: break;
            default:  break;
        }
        btcode1= (Button) view.findViewById(R.id.btcode1);

        btxml1= (Button) view.findViewById(R.id.btxml1);

        tvShowCode= (TextView) view.findViewById(R.id.tvShowCode);
        ShowXml();

        btcode1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                String text= "";
                try{
                    InputStream is = getActivity().getAssets().open(codetxt);
                    int size= is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    text = new String(buffer);

                }catch (Exception ex){
                    ex.printStackTrace();
                }
                tvShowCode.setText(text);
            }
        });

        btxml1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                String text= "";
                try{
                    InputStream is = getActivity().getAssets().open(xmltxt);
                    int size= is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    text = new String(buffer);

                }catch (Exception ex){
                    ex.printStackTrace();
                }
                tvShowCode.setText(text);
            }

        });

    }

    protected void ShowXml(){
        String text= "";
        try{
            InputStream is = getActivity().getAssets().open(xmltxt);
            int size= is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            text = new String(buffer);

        }catch (Exception ex){
            ex.printStackTrace();
        }
        tvShowCode.setText(text);
    }

}

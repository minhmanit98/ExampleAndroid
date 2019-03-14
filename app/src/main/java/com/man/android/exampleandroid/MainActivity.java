package com.man.android.exampleandroid;

import android.app.ActionBar;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.man.android.exampleandroid.Fragment.AlartDialogFragment;
import com.man.android.exampleandroid.Fragment.AnalogAndDigitalClockFragment;
import com.man.android.exampleandroid.Fragment.ButtonFragment;
import com.man.android.exampleandroid.Fragment.CheckBoxFragment;
import com.man.android.exampleandroid.Fragment.DatePickerFragment;
import com.man.android.exampleandroid.Fragment.GridViewFragment;
import com.man.android.exampleandroid.Fragment.ImageButtonFragment;
import com.man.android.exampleandroid.Fragment.ImageViewFragment;
import com.man.android.exampleandroid.Fragment.LinearLayoutFragment_Horizontal;
import com.man.android.exampleandroid.Fragment.LinearLayoutFragment_Vertical;
import com.man.android.exampleandroid.Fragment.ListViewFragment;
import com.man.android.exampleandroid.Fragment.PasswordFragment;
import com.man.android.exampleandroid.Fragment.ProcessBarFragment;
import com.man.android.exampleandroid.Fragment.PromptDialogFragment;
import com.man.android.exampleandroid.Fragment.RadioButtonFragment;
import com.man.android.exampleandroid.Fragment.RatingBarFragment;

import com.man.android.exampleandroid.Fragment.ShowCodeFragment;

import com.man.android.exampleandroid.Fragment.RelativeLayoutFragment;
import com.man.android.exampleandroid.Fragment.SpinnerFragment;
import com.man.android.exampleandroid.Fragment.TableLayoutFragment;

import com.man.android.exampleandroid.Fragment.TextBoxFragment;
import com.man.android.exampleandroid.Fragment.TimePickerFragment;
import com.man.android.exampleandroid.Fragment.ToastNotificationFragment;
import com.man.android.exampleandroid.Fragment.ToggleButtonFragment;
import com.man.android.exampleandroid.Fragment.WebViewFragment;

public class MainActivity extends AppCompatActivity {

    ListViewMain listViewMain = new ListViewMain();
    ShowCodeFragment showCodeFragment=new ShowCodeFragment();

    Button button;
    Button button2;
    String title="ExampleAndroid";
    public static int selected=100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(title);


        setContentView(R.layout.activity_main);
        button=(Button) findViewById(R.id.button);
        button2=(Button) findViewById(R.id.button2);
        initFragment(100);
        if(selected==100){
            button2.setEnabled(false);
        }else{
            button2.setEnabled(true);
        }

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragmentContent(listViewMain);
                selected=100;
                if(selected==100){
                    button2.setEnabled(false);
                }else{
                    button2.setEnabled(true);
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragmentContent(showCodeFragment);
                setTitle(title);

            }
        });



    }

    public void initFragment(int selectfr) {


        Fragment fragment = new Fragment();


        ButtonFragment buttonFragment = new ButtonFragment();
        TextBoxFragment textBoxFragment = new TextBoxFragment();
        PasswordFragment passwordFragment = new PasswordFragment();
        CheckBoxFragment checkBoxFragment = new CheckBoxFragment();
        ListViewFragment listViewFragment = new ListViewFragment();
        RadioButtonFragment radioButtonFragment = new RadioButtonFragment();
        ToggleButtonFragment toggleButtonFragment = new ToggleButtonFragment();
        RatingBarFragment ratingBarFragment = new RatingBarFragment();
        SpinnerFragment spinnerFragment = new SpinnerFragment();
        DatePickerFragment datePickerFragment = new DatePickerFragment();
        TimePickerFragment timePickerFragment = new TimePickerFragment();
        AnalogAndDigitalClockFragment analogAndDigitalClockFragment = new AnalogAndDigitalClockFragment();
        ProcessBarFragment processBarFragment = new ProcessBarFragment();
        AlartDialogFragment alartDialogFragment = new AlartDialogFragment();
        PromptDialogFragment promptDialogFragment = new PromptDialogFragment();
        ToastNotificationFragment toastNotificationFragment = new ToastNotificationFragment();
        ImageViewFragment imageViewFragment = new ImageViewFragment();
        ImageButtonFragment imageButtonFragment = new ImageButtonFragment();
        LinearLayoutFragment_Vertical linearLayoutFragment_vertical = new LinearLayoutFragment_Vertical();
        LinearLayoutFragment_Horizontal linearLayoutFragment_horizontal = new LinearLayoutFragment_Horizontal();
        RelativeLayoutFragment relativeLayoutFragment = new RelativeLayoutFragment();
        TableLayoutFragment tableLayoutFragment = new TableLayoutFragment();
        GridViewFragment gridViewFragment = new GridViewFragment();
        WebViewFragment webViewFragment = new WebViewFragment();

        switch (selectfr){
            case 0: fragment=buttonFragment; title="Button"; break;
            case 1: fragment=textBoxFragment; title="TextBox";  break;
            case 2: fragment=passwordFragment; title="Password";  break;
            case 3: fragment=checkBoxFragment; title="Button";  break;
            case 4: fragment=listViewFragment;title="Button";   break;
            case 5: fragment=radioButtonFragment;title="Button";  break;
            case 6: fragment=toggleButtonFragment;title="Button";  break;
            case 7: fragment=ratingBarFragment;title="Button";  break;
            case 8: fragment=spinnerFragment;title="Button" ; break;
            case 9: fragment=datePickerFragment;title="Button"; break;
            case 10: fragment=timePickerFragment;title="Button";  break;
            case 11: fragment=analogAndDigitalClockFragment;title="Button";  break;
            case 12: fragment=processBarFragment;title="Button";  break;
            case 13: fragment=alartDialogFragment;title="Button" ; break;
            case 14: fragment=promptDialogFragment; title="Button";  break;
            case 15: fragment=toastNotificationFragment;title="Button";  break;
            case 16: fragment=imageViewFragment;title="Button";  break;
            case 17: fragment=imageButtonFragment; title="Button";  break;
            case 18: fragment= linearLayoutFragment_vertical;  title="Button";  break;
            case 19: fragment= linearLayoutFragment_horizontal; title="Button";  break;
            case 20: fragment=relativeLayoutFragment;  title="Button";  break;
            case 21: fragment=tableLayoutFragment; title="Button";   break;
            case 22: fragment=gridViewFragment; title="Button";  break;
            case 23: fragment=webViewFragment; title="Button";   break;

            case 100:fragment=listViewMain; title="Button"; break;
            default: fragment=listViewMain; break;
        }

        selected=selectfr;
        if(selected==100){
            button2.setEnabled(false);
        }else{
            button2.setEnabled(true);
        }
        setTitle(title);
        FragmentManager fragmentManager = getSupportFragmentManager();

        FragmentTransaction ft = fragmentManager.beginTransaction();

        ft.replace(R.id.container_body,fragment );


        ft.commit();


    }


    public void replaceFragmentContent(Fragment fragment) {

        if (fragment != null) {

            FragmentManager fmgr = getSupportFragmentManager();

            FragmentTransaction ft = fmgr.beginTransaction();

            ft.replace(R.id.container_body, fragment);

            ft.commit();
            setTitle("ExampleAndroid");

        }

    }
    public void RunFragment(Fragment fragment) {



            FragmentManager fmgr = getSupportFragmentManager();

            FragmentTransaction ft = fmgr.beginTransaction();

            ft.replace(R.id.container_body, fragment);

            ft.commit();



    }


}

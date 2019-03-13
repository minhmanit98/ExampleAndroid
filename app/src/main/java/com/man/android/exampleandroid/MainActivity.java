package com.man.android.exampleandroid;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

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
<<<<<<< HEAD
import com.man.android.exampleandroid.Fragment.ShowCodeFragment;
=======
import com.man.android.exampleandroid.Fragment.RelativeLayoutFragment;
import com.man.android.exampleandroid.Fragment.SpinnerFragment;
import com.man.android.exampleandroid.Fragment.TableLayoutFragment;
>>>>>>> truong
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
    public static int selected;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button) findViewById(R.id.button);
        button2=(Button) findViewById(R.id.button2);
        initFragment(100);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragmentContent(listViewMain);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragmentContent(showCodeFragment);
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

        TimePickerFragment timePickerFragment = new TimePickerFragment();
        DatePickerFragment datePickerFragment = new DatePickerFragment();



        switch (selectfr){
            case 0: fragment=buttonFragment; break;
            case 1: fragment=textBoxFragment; break;
            case 2: fragment=passwordFragment; break;
            case 3: fragment=checkBoxFragment; break;
            case 4: fragment=listViewFragment; break;
            case 5: fragment=radioButtonFragment; break;
            case 6: fragment=toggleButtonFragment; break;
            case 7: fragment=ratingBarFragment; break;
            case 8: fragment=spinnerFragment; break;
            case 9: fragment=datePickerFragment;break;
            case 10: fragment=timePickerFragment; break;
            case 11: fragment=analogAndDigitalClockFragment; break;
            case 12: fragment=processBarFragment; break;
            case 13: fragment=alartDialogFragment; break;
            case 14: fragment=promptDialogFragment; break;
            case 15: fragment=toastNotificationFragment; break;
            case 16: fragment=imageViewFragment; break;
            case 17: fragment=imageButtonFragment; break;
            case 18: fragment= linearLayoutFragment_vertical; break;
            case 19: fragment= linearLayoutFragment_horizontal; break;
            case 20: fragment=relativeLayoutFragment; break;
            case 21: fragment=tableLayoutFragment; break;
            case 22: fragment=gridViewFragment; break;
            case 23: fragment=webViewFragment; break;

            case 100:fragment=listViewMain; break;
            default: fragment=listViewMain; break;
        }

        selected=selectfr;
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

        }

    }
    public void RunFragment(Fragment fragment) {



            FragmentManager fmgr = getSupportFragmentManager();

            FragmentTransaction ft = fmgr.beginTransaction();

            ft.replace(R.id.container_body, fragment);

            ft.commit();



    }

}

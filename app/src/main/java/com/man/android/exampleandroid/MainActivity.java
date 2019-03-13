package com.man.android.exampleandroid;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.man.android.exampleandroid.Fragment.ButtonFragment;
import com.man.android.exampleandroid.Fragment.CheckBoxFragment;
import com.man.android.exampleandroid.Fragment.ListViewFragment;
import com.man.android.exampleandroid.Fragment.PasswordFragment;
import com.man.android.exampleandroid.Fragment.RadioButtonFragment;
import com.man.android.exampleandroid.Fragment.RatingBarFragment;
import com.man.android.exampleandroid.Fragment.ShowCodeFragment;
import com.man.android.exampleandroid.Fragment.TextBoxFragment;
import com.man.android.exampleandroid.Fragment.ToggleButtonFragment;

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



        switch (selectfr){
            case 0: fragment=buttonFragment; break;
            case 1: fragment=textBoxFragment; break;
            case 2: fragment=passwordFragment; break;
            case 3: fragment=checkBoxFragment; break;
            case 4: fragment=listViewFragment; break;
            case 5: fragment=radioButtonFragment; break;
            case 6: fragment=toggleButtonFragment; break;
            case 7: fragment=ratingBarFragment; break;
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

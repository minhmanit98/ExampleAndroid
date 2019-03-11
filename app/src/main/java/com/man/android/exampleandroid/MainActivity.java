package com.man.android.exampleandroid;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.man.android.exampleandroid.Fragment.ButtonFragment;
import com.man.android.exampleandroid.Fragment.TextBoxFragment;

public class MainActivity extends AppCompatActivity {

    ListViewMain listViewMain = new ListViewMain();

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button) findViewById(R.id.button);
        initFragment(100);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragmentContent(listViewMain);
            }
        });


    }

    public void initFragment(int selectfr) {


        Fragment fragment = new Fragment();

        ButtonFragment buttonFragment = new ButtonFragment();
        TextBoxFragment textBoxFragment = new TextBoxFragment();

        switch (selectfr){
            case 0: fragment=buttonFragment; break;
            case 1: fragment=textBoxFragment; break;
            case 100:fragment=listViewMain; break;
            default: fragment=listViewMain; break;
        }


        FragmentManager fragmentManager = getSupportFragmentManager();

        FragmentTransaction ft = fragmentManager.beginTransaction();

        ft.replace(R.id.container_body,fragment );

        ft.commit();

    }


    protected void replaceFragmentContent(Fragment fragment) {

        if (fragment != null) {

            FragmentManager fmgr = getSupportFragmentManager();

            FragmentTransaction ft = fmgr.beginTransaction();

            ft.replace(R.id.container_body, fragment);

            ft.commit();

        }

    }





}

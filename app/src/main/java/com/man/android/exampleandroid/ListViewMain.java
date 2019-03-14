package com.man.android.exampleandroid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.man.android.exampleandroid.adapter.ItemAdapter;

import java.util.ArrayList;

public class ListViewMain extends Fragment {
    ListView lv;
    private ActionActivity actionActivity;
    public static int SelectFr=0;

    ItemAdapter adapter;
    ArrayList<Integer> idImages;
    ArrayList<String> nameList;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.listviewmain, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
// Get ListView object from xml
        lv = (ListView) view.findViewById(R.id.list);

        // Defined Array values to show in ListView
//        String[] values = new String[] { "Button",
//                "TextBox",
//                "Password",
//                "CheckBox",
//                "ListView",
//                "Radio Buttons",
//                "Toggle Button",
//                "Rating Bar",
//                "Spinner",
//                "Date Picker",
//                "Time Picker",
//                "Analog And Digital Clock",
//                "ProcessBar",
//                "Alart Dialog",
//                "Prompt Dialog",
//                "Toast Notification",
//                "ImageView",
//                "ImageButton",
//                "LinearLayoutVertical",
//                "LinearLayoutHorizontal",
//                "RelativeLayout",/                "TableLayout",
//                "GridView",
//                "WebView"
//        };
        idImages = new ArrayList<>();
        idImages =getList();
        nameList = new ArrayList<>();
        nameList=getNameList();
        adapter = new ItemAdapter(getContext(),idImages,nameList);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int itemPosition     = position;
                String  itemValue    = (String) lv.getItemAtPosition(position);
                SelectFr = itemPosition;
                RunSelectFr();
            }
        });
        // Define a new Adapter
        // First parameter - Context
        // Second parameter - Layout for the row
        // Third parameter - ID of the TextView to which the data is written
        // Forth - the Array of data

//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(),
//                android.R.layout.simple_list_item_1, android.R.id.text1, values);


        // Assign adapter to ListView
      //  listView.setAdapter(adapter);

        // ListView Item Click Listener
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view,
//                                    int position, long id) {
//
//                // ListView Clicked item index
//                int itemPosition     = position;
//
//                // ListView Clicked item value
//                String  itemValue    = (String) listView.getItemAtPosition(position);
//
//                // Show Alert
////                Toast.makeText(getContext(),
////                        itemValue + itemPosition , Toast.LENGTH_SHORT)
////                        .show();
//                SelectFr = itemPosition;
//                RunSelectFr();
//
//            }
//
//        });

    }
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof ActionActivity) {
            this.actionActivity = (ActionActivity) context;
        }
    }
    private void RunSelectFr() {

        Intent intent = new Intent(getActivity(),ActionActivity.class);
        startActivity(intent);

    }
    public ArrayList<Integer> getList(){
        idImages = new ArrayList<>();
        idImages.add(R.drawable.ic_button);
        idImages.add(R.drawable.ic_text_box);
        idImages.add(R.drawable.ic_pasword);
        idImages.add(R.drawable.ic_check_box);
        idImages.add(R.drawable.ic_listview);
        idImages.add(R.drawable.ic_radio_button);
        idImages.add(R.drawable.ic_toggle_button);
        idImages.add(R.drawable.ic_rating);
        idImages.add(R.drawable.ic_spinner);
        idImages.add(R.drawable.ic_date_picker);
        idImages.add(R.drawable.ic_time_picker);
        idImages.add(R.drawable.ic_digital_analog);
        idImages.add(R.drawable.ic_progress);
        idImages.add(R.drawable.ic_alart);
        idImages.add(R.drawable.ic_prompt);
        idImages.add(R.drawable.ic_toast);
        idImages.add(R.drawable.ic_image_view);
        idImages.add(R.drawable.ic_image_button);
        idImages.add(R.drawable.ic_linear);
        idImages.add(R.drawable.ic_linear);
        idImages.add(R.drawable.ic_relative);
        idImages.add(R.drawable.ic_table);
        idImages.add(R.drawable.ic_grid);
        idImages.add(R.drawable.ic_webview);

        return idImages;
    }

    public ArrayList<String> getNameList(){
        nameList = new ArrayList<>();
        nameList.add("Button");
        nameList.add("TextBox");
        nameList.add("Password");
        nameList.add("CheckBox");
        nameList.add("ListView");
        nameList.add("Radio Buttons");
        nameList.add("Toggle Button");
        nameList.add("Rating Bar");
        nameList.add("Spinner");
        nameList.add("Date Picker");
        nameList.add("Time Picker");
        nameList.add("Analog And Digital Clock");
        nameList.add("ProcessBar");
        nameList.add("Alart Dialog");
        nameList.add("Prompt Dialog");
        nameList.add("Toast Notification");
        nameList.add("ImageView");
        nameList.add("ImageButton");
        nameList.add("LinearLayoutVertical");
        nameList.add("LinearLayoutHorizontal");
        nameList.add("RelativeLayout");
        nameList.add("TableLayout");
        nameList.add("GridView");
        nameList.add("WebView");

        return nameList;
    }
}

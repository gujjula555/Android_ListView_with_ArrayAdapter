package com.example.android.colors.android_listview_with_arrayadapter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity implements AdapterView.OnItemClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] eatables = new String[]{"Pizza", "Olives", "Burger", "Sauce", "Cheeze", "Onion"};
        ListView lv = (ListView) findViewById(R.id.listView);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.single_item ,eatables);
        lv.setAdapter(arrayAdapter);
        lv.setOnItemClickListener(this);
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String eatableItemName=(String) parent.getItemAtPosition(position);
        Toast.makeText(this, ""+eatableItemName, Toast.LENGTH_SHORT).show();
    }
}
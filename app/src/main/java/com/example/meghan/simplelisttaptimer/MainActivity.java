package com.example.meghan.simplelisttaptimer;


import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    final static String TAG = "com.example.meghan.simplelisttaptimer.MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addNewButton = (Button) findViewById(R.id.newListItem_button);
        final EditText mNewListItem_edittext = (EditText) findViewById(R.id.newListItem_edittext);

        ListView mSimpleListView = (ListView) findViewById(R.id.simple_listview);

        //
        final  SimpleListAdapter simpleListAdapter = new SimpleListAdapter(this, R.layout.simple_list_item);

        //
        mSimpleListView.setAdapter(simpleListAdapter);

        addNewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //read what user has input in
                String userEnteredText = mNewListItem_edittext.getText().toString();

                //Check if data was put in
                if (userEnteredText.length() == 0) {
                    Toast.makeText(MainActivity.this, "Enter text please", Toast.LENGTH_SHORT).show();
                    return;
                }

                //adds to the array
                timePlus newItemAndTime = new timePlus(userEnteredText);
                simpleListAdapter.add(new timePlus(userEnteredText));

                //let the adapter know data has changed
                simpleListAdapter.notifyDataSetChanged();

                //clear EditText, so next item can be typed in
                mNewListItem_edittext.getText().clear();
            }
        });
    }

}

package com.example.meghan.simplelisttaptimer;

/**
 * Created by Meghan on 9/25/2016.
 */

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class SimpleListAdapter extends ArrayAdapter<timePlus> {

    Context context; //activates the import from android, list belong to this

    public SimpleListAdapter(Context context, int resource) {
        super(context, resource); //activates the class into something
        this.context = context;
    }

    //List items will be add into this method and a view made for them
    //asdf

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View rowView = convertView;

        if (rowView == null) {
            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            rowView = inflater.inflate(R.layout.simple_list_item, parent, false);
        }

        timePlus item = getItem(position);

        //to get the values from the view
        TextView mSimpleText = (TextView) rowView.findViewById(R.id.simple_item_text);
        TextView mSimpleTime = (TextView) rowView.findViewById(R.id.simple_item_created_time);

        //and place their values
        mSimpleText.setText(item.getText());
        mSimpleTime.setText(item.getCreated().toString());

        return rowView; //Returns what is to displayed in your list
    }

}

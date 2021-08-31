package com.example.temp.listviewpractice;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class costumeArrayAdapter extends ArrayAdapter<customArrayClass> {

    public costumeArrayAdapter(Activity context, ArrayList<customArrayClass> customListItems) {

        super(context, 0, customListItems);
    }


    @Override
    public View getView ( int position, View convertView, ViewGroup parent)

    {
        View listItemsView = convertView;


        if (listItemsView == null) {
            //We must create a View:
            listItemsView = LayoutInflater.from(getContext()).inflate(android.R.layout.list_content, parent, false);

        }


        //Here we can do changes to the convertView, such as set a text on a TextView
        //or an image on an ImageView.
        customArrayClass currentListItemPosition = getItem(position);

        TextView defaultTranslation = convertView.findViewById(R.id.default_translation);
        defaultTranslation.setText(currentListItemPosition.getmDefaultTranslation());

        TextView miwokTranslation = convertView.findViewById(R.id.miwok_translation);
        miwokTranslation.setText(currentListItemPosition.getmMiwokTranslation());


        //      return super.getView(position, convertView, parent);


        // return super.getView(position, listItemsView, parent);
        return listItemsView;
    }
}

package com.example.temp.listviewpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.view.View;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * USING ARRAY LIST WITH ARRAY ADAPTER WITH NO CUSTUME VIEW
         ****/

        /***
         */
         ArrayList<String> simpleListItems = new  ArrayList<>();
         int simpleItems = 0;
         while (simpleItems < 100)
         {
         String stringItems = Integer.toString(simpleItems);
         stringItems = "This Is Number : " + stringItems ;
         simpleListItems.add(stringItems);
         simpleItems ++ ;
         }
         ListView newListView = (ListView) findViewById(R.id.list_view);
         ArrayAdapter<String> arrayAdapterList = new ArrayAdapter<>(this ,android.R.layout.simple_list_item_1 , simpleListItems);

         newListView.setAdapter(arrayAdapterList);


/***
 *
 * USING ARRAY LIST WITH CUSTOME VIEW TOW TEXT VIEW  AND CLASS FOR INPUT
 *
 *
 */


      /**  ArrayList<customArrayClass> customListItems = new  ArrayList<customArrayClass>();

        customListItems.add(new customArrayClass("One"  ,"Lottie"));
        customListItems.add(new customArrayClass("Tow"  ,"Lottie"));
        customListItems.add(new customArrayClass("Three","Lottie"));
        customListItems.add(new customArrayClass("Four" ,"Lottie"));
        customListItems.add(new customArrayClass("Five" ,"Lottie"));
        customListItems.add(new customArrayClass("Six"  ,"Lottie"));
        customListItems.add(new customArrayClass("Seven","Lottie"));
        customListItems.add(new customArrayClass("Eight","Lottie"));
        customListItems.add(new customArrayClass("Nine" ,"Lottie"));
        customListItems.add(new customArrayClass("Ten"  ,"Lottie"));



        costumeArrayAdapter arrayAdapterList = new costumeArrayAdapter(this , customListItems);

        ListView newListView = (ListView) findViewById(R.id.list_item);

        newListView.setAdapter(arrayAdapterList);



**/




    }
}
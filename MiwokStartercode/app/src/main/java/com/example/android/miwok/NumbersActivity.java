//This is may creation
//
//package com.example.android.miwok;
//
//
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.util.Log;
//import android.widget.ArrayAdapter;
//import android.widget.LinearLayout;
//import android.widget.ListView;
//import android.widget.TextView;
//
//import java.util.ArrayList;
//
//public class NumbersActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_numbers);
//
//        /*
//        //-----pint array value to the  log file
//        String [] numberActivityArrayList = new String[10];
//
//        numberActivityArrayList[0] = "One" ;
//        numberActivityArrayList[1] = "Tow" ;
//        numberActivityArrayList[2] = "Three" ;
//        numberActivityArrayList[3] = "Four" ;
//        numberActivityArrayList[4] = "Five" ;
//
//        Log.v("This is value of 0  : " ,numberActivityArrayList[0]);
//        Log.v("This is value of 1  : " ,numberActivityArrayList[1]);
//        Log.v("This is value of 2  : " ,numberActivityArrayList[2]);
//        Log.v("This is value of 3  : " ,numberActivityArrayList[3]);
//        */
//
//        ArrayList<String> numbersWords = new ArrayList<>();
//
//        numbersWords.add("one");
//        numbersWords.add("Tow");
//        numbersWords.add("Three");
//        numbersWords.add("Four");
//        numbersWords.add("Five");
//        numbersWords.add("Six");
//        numbersWords.add("Seven");
//        numbersWords.add("Eight");
//        numbersWords.add("Nine");
//        numbersWords.add("Ten");
//
//        // store the numbers_activity_view in variable so you can add to it view form java code
//        //-- later on by calling add text view to it from the java method and then display on it
//        //the data you want
//    LinearLayout numbersActivityRootView = (LinearLayout)findViewById(R.id.numbers_activity_view) ;
/////---------------------------------
//                                 /*
//    //-declaring nad calling each word by typing it index stored value
//        // creating the TextView object that will add later to the view
//        TextView numbersWordView = new TextView(this);
//        // set the word you want in the numbersWordView variable
//        numbersWordView.setText(words.get(0));
//        //now add the view as child View (numbersWordView) to the root view (numbersActivityRootView)
//        numbersActivityRootView.addView(numbersWordView);
//                                */
//
/////--------------------------------- repeat the code to view  other word while adding new view
//                                                                    /*
//        TextView numbersWordView2 = new TextView(this);
//        numbersWordView2.setText(words.get(1));
//        numbersActivityRootView.addView(numbersWordView2);
//
//
//        ///make the java make a little work for you
//        int index = 0 ;
//
//        TextView numbersWordView3 = new TextView(this);
//        numbersWordView3.setText(words.get(index));
//        numbersActivityRootView.addView(numbersWordView3);
//index =index +1;
//        TextView numbersWordView4 = new TextView(this);
//        numbersWordView4.setText(words.get(index));
//        numbersActivityRootView.addView(numbersWordView4);
//                                                                    */
//
////---------------------- Full Automate with loop
//
////---------while loop
//                                /*
//        int numbersArrayListIndex = 0 ;
//
//
//        //Declaring the loop with specific counter in mind
//        //while (numbersArrayListIndex<10)
//
//
//            //Declaring the loop leaving the counter to specific pre condition
//           //,no mater if the arrayList index  changed it will change here
//            while (numbersArrayListIndex<numbersWords.size())
//        {
//            TextView numbersWordView = new TextView(this);
//            numbersWordView.setText(numbersWords.get(numbersArrayListIndex));
//            numbersActivityRootView.addView(numbersWordView);
//
//            //to increment use
//
//            //numbersArrayListIndex = numbersArrayListIndex +1 ;
//
//            //or
//            numbersArrayListIndex ++ ;
//
//        }
//                                    */
//
/////*****************For loop
//                            /*
//        for (int numbersArrayListIndex = 0 ; numbersArrayListIndex < numbersWords.size() ;
//             numbersArrayListIndex++ )
//        {
//            TextView numbersWordView = new TextView(this);
//            numbersWordView.setText(numbersWords.get(numbersArrayListIndex));
//            numbersActivityRootView.addView(numbersWordView);
//        }                   */
//
//
//
//
//
//
//
//    }
//}
//

    //------------------------Now its time for the ListView & Array Adapter
/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */




package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        // Create a list of words
        ArrayList<String> words = new ArrayList<String>();
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");

        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");

        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");

        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");

        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        ArrayAdapter<String> itemsAdapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_gallery_item, words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = (ListView) findViewById(R.id.numbers_activity_view);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(itemsAdapter);




    }
}
package com.example.android.weather;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createWeatherMessage(77 , "Ciro");
    }


    /**
     * Display the city name and the temperature of the city
     *
     * @param temperature is the temperature of the city
     * @param cityName is the name of the city
     */
    private String createWeatherMessage (int temperature , String cityName ) {
        return "welcome to " + cityName + " where the temperate is " + temperature + " F ";
    }



}

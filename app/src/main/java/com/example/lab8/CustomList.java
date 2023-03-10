package com.example.lab8;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomList {

    private List<City> cities = new ArrayList<>();
    private Context context;


    public List getCities() {
        List<City> list = cities;
        //Collections.sort(list);
        return list;
    }

    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * This function checks if a city is in the list
     * @param city
     * city to be checked
     * @return boolean
     * boolean indicating if city is in list or not
     */
//    public boolean hasCity(City city){
//        return cities.contains(city);
//    }

    /**
     * This function deletes a city from the list
     * @param city
     * city to be deleted
     * @throws IllegalArgumentException
     * exception thrown when city to be deleted is not in list
     */
    public void delete(City city) {
        if (!cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.remove(city);
    }

    /**
     * function counts how many cities are in the list
     * @return int
     * returns integer indicating number of cities in list
     */
//    public int countCities(){
//        return cities.size();
//    }



}

package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList mockCustomList() {
        CustomList CustomList = new CustomList();
        CustomList.add(mockCity());
        return CustomList;
    }
    private City mockCity() {
        return new City("Edmonton", "Alberta");
    }
    
    @Test
    void testDelete(){
        CustomList CustomList = mockCustomList();
        City city_one = new City("Toronto", "Ontario");
        CustomList.add(city_one);
        assertEquals(2, CustomList.getCities().size());
        CustomList.delete(city_one);
        assertEquals(1, CustomList.getCities().size());
    }

    @Test
    void testDeleteException() {
        CustomList CustomList = mockCustomList();
        City city = new City("Yellowknife", "Northwest Territories");
        assertThrows( IllegalArgumentException.class, () -> {
            CustomList.delete(city); });
    }

    @Test
    void testHasCity(){
        CustomList CustomList = mockCustomList();
        City city = new City("Calgary", "Alberta");
        City city_two = new City("Regina", "Saskatchewan");
        CustomList.add(city);
        assertTrue(CustomList.hasCity(city));
        assertFalse(CustomList.hasCity(city_two));
    }

    @Test
    void testCountCities(){
        CustomList CustomList = mockCustomList();
        assertEquals(1, CustomList.countCities());
        City city = new City("Red Deer", "Alberta");
        CustomList.add(city);
        assertEquals(2, CustomList.countCities());
        CustomList.delete(city);
        assertEquals(1, CustomList.countCities());
    }


}

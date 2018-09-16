package com.yfy.owm;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.yfy.owm.data.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CityUtils {
    private CityUtils() {
    } // do not let anyone instantiate

    /*
     * constants
     * */

    public static final String FILE_NAME = "city.list.json";
    public static final String PATH = "src/main/resources/";

    public static List<City> getOWMCities() {
        List<City> cityList = null;
        try (BufferedReader reader = new BufferedReader(
                new FileReader(PATH + FILE_NAME)
        )) {
            GsonBuilder builder = new GsonBuilder()
                    .setPrettyPrinting();
            Gson gson = builder.create();

            cityList = new ArrayList<>(
                    List.of(
                            gson.fromJson(reader,City[].class)
                    )
            );

//            cityList.sort(Comparator.comparing(City::getName));

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            return cityList;
        }
    }

//    public static void main(String[] args) {
//        getOWMCities();
//        getOWMCities();
//    }

}

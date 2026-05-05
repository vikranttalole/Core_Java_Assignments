package com.demo.dao;

import java.util.*;

public class CityDaoImpl implements CityDao {

    private TreeMap<String, List<String>> cityMap = new TreeMap<>();

    @Override
    public void addCity(String city, List<String> trees) {
        if (cityMap.containsKey(city)) {
            System.out.println("City already exists!");
        } else {
            cityMap.put(city, trees);
            System.out.println("City added successfully!");
        }
    }

    @Override
    public List<String> findTrees(String city) {
        return cityMap.get(city);
    }

    @Override
    public void deleteCity(String city) {
        if (cityMap.containsKey(city)) {
            cityMap.remove(city);
            System.out.println("City deleted successfully!");
        } else {
            System.out.println("City not found!");
        }
    }

    @Override
    public void displayAll() {

        System.out.println("---- Using Iterator ----");
        Iterator<Map.Entry<String, List<String>>> it = cityMap.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<String, List<String>> entry = it.next();
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("---- Using for-each ----");
        for (Map.Entry<String, List<String>> entry : cityMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
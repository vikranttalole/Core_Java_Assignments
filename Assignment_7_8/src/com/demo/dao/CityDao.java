package com.demo.dao;

import java.util.List;

public interface CityDao {

    void addCity(String city, List<String> trees);

    List<String> findTrees(String city);

    void deleteCity(String city);

    
    void addTreeToCity(String city, String tree);

    void findCitiesByTree(String tree);
    
    void displayAll();
}
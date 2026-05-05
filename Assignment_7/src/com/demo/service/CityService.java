package com.demo.service;

import java.util.List;

public interface CityService {

    void addCity(String city, List<String> trees);

    List<String> findTrees(String city);

    void deleteCity(String city);

    void displayAll();
}
package com.demo.service;

import java.util.List;

import com.demo.dao.CityDao;
import com.demo.dao.CityDaoImpl;

public class CityServiceImpl implements CityService {

    private CityDao dao = new CityDaoImpl();

    @Override
    public void addCity(String city, List<String> trees) {
        dao.addCity(city, trees);
    }

    @Override
    public List<String> findTrees(String city) {
        return dao.findTrees(city);
    }

    @Override
    public void deleteCity(String city) {
        dao.deleteCity(city);
    }

    @Override
    public void displayAll() {
        dao.displayAll();
    }
}
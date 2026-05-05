package com.demo.model;

import java.util.List;

public class City {
    private String cityName;
    private List<String> trees;

    public City() {}

    public City(String cityName, List<String> trees) {
        this.cityName = cityName;
        this.trees = trees;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public List<String> getTrees() {
        return trees;
    }

    public void setTrees(List<String> trees) {
        this.trees = trees;
    }
}
package com.dlaptsev.sbb.service;

import com.dlaptsev.sbb.entity.City;

import java.util.List;

public interface CityService {

    City addCity(City city);
    void delete(long idCity);
    City getByCityName(String cityName);
    City editCity(City city);
    City findById(long idCity);
    List<City> getAll();
}

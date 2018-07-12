package com.dlaptsev.sbb.service.impl;

import com.dlaptsev.sbb.entity.City;
import com.dlaptsev.sbb.repository.CityRepository;
import com.dlaptsev.sbb.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityRepository cityRepository;

    @Override
    public City addCity(City city) {
        return cityRepository.saveAndFlush(city);
    }

    @Override
    public void delete(long idCity) {
        cityRepository.delete(idCity);
    }

    @Override
    public City getByCityName(String cityName) {
        return cityRepository.findByCityName(cityName);
    }

    @Override
    public City editCity(City city) {
        return cityRepository.saveAndFlush(city);
    }

    @Override
    public City findById(long idCity) {
        return cityRepository.findOne(idCity);
    }

    @Override
    public List<City> getAll() {
        return cityRepository.findAll();
    }
}

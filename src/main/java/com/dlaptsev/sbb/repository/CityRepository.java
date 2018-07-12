package com.dlaptsev.sbb.repository;

import com.dlaptsev.sbb.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CityRepository extends JpaRepository<City, Long> {

    @Query("select c from City c where c.cityName = :cityName")
    City findByCityName(@Param("cityName") String cityName);
}

package com.dlaptsev.sbb.service;

import com.dlaptsev.sbb.entity.Station;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StationService {

    Station addStation(Station station);
    void delete (long stationId);
    Station editStation(Station station);
    List<Station> getAll();
    Station findById(long stationId);

}

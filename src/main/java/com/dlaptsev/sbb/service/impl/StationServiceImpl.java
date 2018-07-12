package com.dlaptsev.sbb.service.impl;

import com.dlaptsev.sbb.entity.Station;
import com.dlaptsev.sbb.repository.ScheduleRepository;
import com.dlaptsev.sbb.repository.StationRepository;
import com.dlaptsev.sbb.service.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StationServiceImpl implements StationService {

    @Autowired
    StationRepository stationRepository;

    @Override
    public Station addStation(Station station) {
        return stationRepository.saveAndFlush(station);
    }

    @Override
    public void delete(long station) {
        stationRepository.delete(station);
    }

    @Override
    public Station editStation(Station stationId) {
        return stationRepository.saveAndFlush(stationId);
    }

    @Override
    public List<Station> getAll() {
        return stationRepository.findAll();
    }

    @Override
    public Station findById(long stationId) {
        return stationRepository.findOne(stationId);
    }
}

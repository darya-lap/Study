package com.dlaptsev.sbb.service.impl;

import com.dlaptsev.sbb.entity.Train;
import com.dlaptsev.sbb.repository.TrainRepository;
import com.dlaptsev.sbb.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainServiceImpl implements TrainService {

    @Autowired
    TrainRepository trainRepository;

    @Override
    public Train addTrain(Train train) {
        return trainRepository.saveAndFlush(train);
    }

    @Override
    public void delete(long trainId) {
        trainRepository.delete(trainId);
    }

    @Override
    public Train editTrain(Train train) {
        return trainRepository.saveAndFlush(train);
    }

    @Override
    public List<Train> getAll() {
        return trainRepository.findAll();
    }

    @Override
    public Train findById(long trainId) {
        return trainRepository.findOne(trainId);
    }
}

package com.dlaptsev.sbb.service;

import com.dlaptsev.sbb.entity.Train;

import java.util.List;

public interface TrainService {
    Train addTrain(Train train);
    void delete (long trainId);
    Train editTrain(Train train);
    List<Train> getAll();
    Train findById(long trainId);
}

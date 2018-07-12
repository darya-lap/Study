package com.dlaptsev.sbb.service.impl;

import com.dlaptsev.sbb.entity.Passenger;
import com.dlaptsev.sbb.repository.PassengerRepository;
import com.dlaptsev.sbb.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassengerServiceImpl implements PassengerService {

    @Autowired
    PassengerRepository passengerRepository;

    @Override
    public Passenger addPassenger(Passenger passenger) {
        return passengerRepository.saveAndFlush(passenger);
    }

    @Override
    public void delete(long passengerId) {
        passengerRepository.delete(passengerId);
    }

    @Override
    public Passenger getByPassport(String passport) {
        return passengerRepository.findByPassport(passport);
    }

    @Override
    public List<Passenger> getByPassengerSurname(String passengerSurname) {
        return passengerRepository.findAllByPassengerSurname(passengerSurname);
    }

    @Override
    public Passenger editPassenger(Passenger passenger) {
        return passengerRepository.saveAndFlush(passenger);
    }

    @Override
    public List<Passenger> getAll() {
        return passengerRepository.findAll();
    }

    @Override
    public Passenger findById(long passengerId) {
        return passengerRepository.findOne(passengerId);
    }
}

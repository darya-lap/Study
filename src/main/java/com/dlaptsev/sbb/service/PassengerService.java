package com.dlaptsev.sbb.service;

import com.dlaptsev.sbb.entity.Passenger;

import java.util.List;

public interface PassengerService {

    Passenger addPassenger(Passenger passenger);
    void delete(long passengerId);
    Passenger getByPassport(String passport);
    List<Passenger> getByPassengerSurname (String passengerSurname);
    Passenger editPassenger (Passenger passenger);
    List<Passenger> getAll();
    Passenger findById(long passengerId);
}

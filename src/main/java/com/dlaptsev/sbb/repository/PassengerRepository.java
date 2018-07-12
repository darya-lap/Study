package com.dlaptsev.sbb.repository;

import com.dlaptsev.sbb.entity.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {


    @Query("select p from Passenger p where p.passport = :passport")
    Passenger findByPassport(@Param("passport") String passport);

//    @Query("select p from Passenger p where p.passengerSurname = :passengerSurname")
    List<Passenger> findAllByPassengerSurname(String passengerSurname);
//    List<Passenger> findByPassengerSurname(@Param("passengerSurname") String passengerSurname);
}

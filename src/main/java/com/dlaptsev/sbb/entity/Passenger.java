package com.dlaptsev.sbb.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Passenger {
    private long passengerId;
    private String passport;
    private String passengerName;
    private String passengerSurname;
    private Date dateOfBirth;

    public Passenger(String passport, String passengerName, String passengerSurname, Date dateOfBirth) {
        this.passport = passport;
        this.passengerName = passengerName;
        this.passengerSurname = passengerSurname;
        this.dateOfBirth = dateOfBirth;
    }

    public Passenger() {
    }

    @Id
    @Column(name = "passenger_id", nullable = false)
    public long getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(long passengerId) {
        this.passengerId = passengerId;
    }

    @Basic
    @Column(name = "passport", nullable = false, length = 20)
    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    @Basic
    @Column(name = "passenger_name", nullable = false, length = 45)
    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    @Basic
    @Column(name = "passenger_surname", nullable = false, length = 45)
    public String getPassengerSurname() {
        return passengerSurname;
    }

    public void setPassengerSurname(String passengerSurname) {
        this.passengerSurname = passengerSurname;
    }

    @Basic
    @Column(name = "date_of_birth", nullable = false)
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Passenger passenger = (Passenger) o;

        if (passengerId != passenger.passengerId) return false;
        if (passport != null ? !passport.equals(passenger.passport) : passenger.passport != null) return false;
        if (passengerName != null ? !passengerName.equals(passenger.passengerName) : passenger.passengerName != null)
            return false;
        if (passengerSurname != null ? !passengerSurname.equals(passenger.passengerSurname) : passenger.passengerSurname != null)
            return false;
        if (dateOfBirth != null ? !dateOfBirth.equals(passenger.dateOfBirth) : passenger.dateOfBirth != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (passengerId ^ (passengerId >>> 32));
        result = 31 * result + (passport != null ? passport.hashCode() : 0);
        result = 31 * result + (passengerName != null ? passengerName.hashCode() : 0);
        result = 31 * result + (passengerSurname != null ? passengerSurname.hashCode() : 0);
        result = 31 * result + (dateOfBirth != null ? dateOfBirth.hashCode() : 0);
        return result;
    }
}

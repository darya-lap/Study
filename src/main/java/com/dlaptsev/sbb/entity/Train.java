package com.dlaptsev.sbb.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Train {
    private long trainNumber;
    private int freeTickets;
    private int cityFromCode;
    private int cityToCode;

    public Train(int freeTickets, int cityFromCode, int cityToCode) {
        this.freeTickets = freeTickets;
        this.cityFromCode = cityFromCode;
        this.cityToCode = cityToCode;
    }

    public Train() {
    }

    @Id
    @Column(name = "train_number", nullable = false)
    public long getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(long trainNumber) {
        this.trainNumber = trainNumber;
    }

    @Basic
    @Column(name = "free_tickets", nullable = false)
    public int getFreeTickets() {
        return freeTickets;
    }

    public void setFreeTickets(int freeTickets) {
        this.freeTickets = freeTickets;
    }

    @Basic
    @Column(name = "city_from_code", nullable = false)
    public int getCityFromCode() {
        return cityFromCode;
    }

    public void setCityFromCode(int cityFromCode) {
        this.cityFromCode = cityFromCode;
    }

    @Basic
    @Column(name = "city_to_code", nullable = false)
    public int getCityToCode() {
        return cityToCode;
    }

    public void setCityToCode(int cityToCode) {
        this.cityToCode = cityToCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Train train = (Train) o;

        if (trainNumber != train.trainNumber) return false;
        if (freeTickets != train.freeTickets) return false;
        if (cityFromCode != train.cityFromCode) return false;
        if (cityToCode != train.cityToCode) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (trainNumber ^ (trainNumber >>> 32));
        result = 31 * result + freeTickets;
        result = 31 * result + cityFromCode;
        result = 31 * result + cityToCode;
        return result;
    }
}

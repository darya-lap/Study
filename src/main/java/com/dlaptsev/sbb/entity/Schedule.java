package com.dlaptsev.sbb.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
public class Schedule {
    private long idSchedule;
    private int trainNumber;
    private int idStation;
    private Timestamp time;

    public Schedule(int trainNumber, int idStation, Timestamp time) {
        this.trainNumber = trainNumber;
        this.idStation = idStation;
        this.time = time;
    }

    public Schedule() {
    }

    @Id
    @Column(name = "id_schedule", nullable = false)
    public long getIdSchedule() {
        return idSchedule;
    }

    public void setIdSchedule(long idSchedule) {
        this.idSchedule = idSchedule;
    }

    @Basic
    @Column(name = "train_number", nullable = false)
    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    @Basic
    @Column(name = "id_station", nullable = false)
    public int getIdStation() {
        return idStation;
    }

    public void setIdStation(int idStation) {
        this.idStation = idStation;
    }

    @Basic
    @Column(name = "time", nullable = false)
    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Schedule schedule = (Schedule) o;

        if (idSchedule != schedule.idSchedule) return false;
        if (trainNumber != schedule.trainNumber) return false;
        if (idStation != schedule.idStation) return false;
        if (time != null ? !time.equals(schedule.time) : schedule.time != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idSchedule ^ (idSchedule >>> 32));
        result = 31 * result + trainNumber;
        result = 31 * result + idStation;
        result = 31 * result + (time != null ? time.hashCode() : 0);
        return result;
    }
}

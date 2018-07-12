package com.dlaptsev.sbb.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Station {
    private long idStation;
    private String stationName;

    public Station(String stationName) {
        this.stationName = stationName;
    }

    public Station() {
    }

    @Id
    @Column(name = "id_station", nullable = false)
    public long getIdStation() {
        return idStation;
    }

    public void setIdStation(long idStation) {
        this.idStation = idStation;
    }

    @Basic
    @Column(name = "station_name", nullable = false, length = 45)
    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Station station = (Station) o;

        if (idStation != station.idStation) return false;
        if (stationName != null ? !stationName.equals(station.stationName) : station.stationName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idStation ^ (idStation >>> 32));
        result = 31 * result + (stationName != null ? stationName.hashCode() : 0);
        return result;
    }
}

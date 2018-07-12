package com.dlaptsev.sbb.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ticket {
    private long idTicket;
    private int trainNumber;
    private int idPassenger;

    public Ticket(int trainNumber, int idPassenger) {
        this.trainNumber = trainNumber;
        this.idPassenger = idPassenger;
    }

    public Ticket() {
    }

    @Id
    @Column(name = "id_ticket", nullable = false)
    public long getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(long idTicket) {
        this.idTicket = idTicket;
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
    @Column(name = "id_passenger", nullable = false)
    public int getIdPassenger() {
        return idPassenger;
    }

    public void setIdPassenger(int idPassenger) {
        this.idPassenger = idPassenger;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ticket ticket = (Ticket) o;

        if (idTicket != ticket.idTicket) return false;
        if (trainNumber != ticket.trainNumber) return false;
        if (idPassenger != ticket.idPassenger) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (idTicket ^ (idTicket >>> 32));
        result = 31 * result + trainNumber;
        result = 31 * result + idPassenger;
        return result;
    }
}

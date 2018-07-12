package com.dlaptsev.sbb.service;

import com.dlaptsev.sbb.entity.Ticket;

import java.util.List;

public interface TicketService {

    Ticket addTicket (Ticket ticket);
    void delete (long ticketId);
    Ticket editTicket(Ticket ticket);
    List<Ticket> getAll();
    Ticket findById(long ticketId);

}

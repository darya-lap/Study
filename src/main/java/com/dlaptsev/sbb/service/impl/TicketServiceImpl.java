package com.dlaptsev.sbb.service.impl;

import com.dlaptsev.sbb.entity.Ticket;
import com.dlaptsev.sbb.repository.TicketRepository;
import com.dlaptsev.sbb.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketServiceImpl implements TicketService {

    @Autowired
    TicketRepository ticketRepository;

    @Override
    public Ticket addTicket(Ticket ticket) {
        return ticketRepository.saveAndFlush(ticket);
    }

    @Override
    public void delete(long ticketId) {
        ticketRepository.delete(ticketId);
    }

    @Override
    public Ticket editTicket(Ticket ticket) {
        return ticketRepository.saveAndFlush(ticket);
    }

    @Override
    public List<Ticket> getAll() {
        return ticketRepository.findAll();
    }

    @Override
    public Ticket findById(long ticketId) {
        return ticketRepository.findOne(ticketId);
    }
}

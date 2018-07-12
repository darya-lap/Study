package com.dlaptsev.sbb.repository;

import com.dlaptsev.sbb.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
}

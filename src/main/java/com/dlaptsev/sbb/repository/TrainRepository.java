package com.dlaptsev.sbb.repository;

import com.dlaptsev.sbb.entity.Ticket;
import com.dlaptsev.sbb.entity.Train;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainRepository extends JpaRepository<Train, Long> {
}

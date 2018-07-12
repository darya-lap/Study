package com.dlaptsev.sbb.repository;

import com.dlaptsev.sbb.entity.Station;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StationRepository extends JpaRepository<Station, Long> {
}

package com.dlaptsev.sbb.repository;

import com.dlaptsev.sbb.entity.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
}

package com.dlaptsev.sbb.service.impl;

import com.dlaptsev.sbb.entity.Schedule;
import com.dlaptsev.sbb.repository.ScheduleRepository;
import com.dlaptsev.sbb.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScheduleServiceImpl implements ScheduleService {

    @Autowired
    ScheduleRepository scheduleRepository;

    @Override
    public Schedule addSchedule(Schedule schedule) {
        return scheduleRepository.saveAndFlush(schedule);
    }

    @Override
    public void delete(long scheduleId) {
        scheduleRepository.delete(scheduleId);
    }

    @Override
    public Schedule editSchedule(Schedule schedule) {
        return scheduleRepository.saveAndFlush(schedule);
    }

    @Override
    public List<Schedule> getAll() {
        return scheduleRepository.findAll();
    }

    @Override
    public Schedule findById(long scheduleId) {
        return scheduleRepository.findOne(scheduleId);
    }
}

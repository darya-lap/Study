package com.dlaptsev.sbb.service;

import com.dlaptsev.sbb.entity.Schedule;

import java.util.List;

public interface ScheduleService {

    Schedule addSchedule(Schedule schedule);
    void delete (long scheduleId);
    Schedule editSchedule (Schedule schedule);
    List<Schedule> getAll();
    Schedule findById(long scheduleId);

}

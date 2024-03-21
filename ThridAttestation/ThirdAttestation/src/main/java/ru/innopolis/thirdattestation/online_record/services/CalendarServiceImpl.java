package ru.innopolis.thirdattestation.online_record.services;

import ru.innopolis.thirdattestation.online_record.dto.CalendarDto;
import ru.innopolis.thirdattestation.online_record.repositories.CalendarRepository;


import java.util.List;

import static ru.innopolis.thirdattestation.online_record.dto.CalendarDto.from;

public class CalendarServiceImpl implements CalendarService {
    private CalendarRepository calendarRepository;
    @Override
    public List<CalendarDto> getAll() {
        return from(calendarRepository.findAll());
    }


}

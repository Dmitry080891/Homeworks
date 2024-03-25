package ru.innopolis.thirdattestation.online_record.services;

import ru.innopolis.thirdattestation.online_record.dto.CalendarDto;
import ru.innopolis.thirdattestation.online_record.dto.CustomerDto;
import ru.innopolis.thirdattestation.online_record.models.Calendar;
import ru.innopolis.thirdattestation.online_record.repositories.CalendarRepository;
import ru.innopolis.thirdattestation.online_record.exceptions.FileNotFoundException;

import java.util.List;

import static ru.innopolis.thirdattestation.online_record.dto.CalendarDto.from;

public class CalendarServiceImpl implements CalendarService {
    private CalendarRepository calendarRepository;

    @Override
    public List<CalendarDto> getAll() {
        return from(calendarRepository.findAll());
    }

    @Override
    public CalendarDto getCalendarById(Long id) {
           Calendar calendar = calendarRepository.findById(id).orElseThrow(FileNotFoundException::new);
               return from(calendar);
          }

    @Override
       public CalendarDto create(CalendarDto calendar) {
        return from(calendarRepository.save(
                Calendar.builder()
                        .dateOrder(calendar.getDateOrder())
                        .timeOrder(calendar.getTimeOrder())
                        .build()));

    }
    @Override
    public CalendarDto update(Long calendarId, CalendarDto timeOrder) {
        Calendar calendar = calendarRepository.findById(calendarId).orElseThrow(FileNotFoundException::new);

        calendar.setDateOrder(calendar.getDateOrder());
        calendar.setTimeOrder(calendar.getTimeOrder());
        return from(calendarRepository.save(calendar));
    }

    @Override
    public void deleteById(Long id) {
        CalendarDto calendar = getCalendarById(id);
        calendarRepository.deleteById(id);
    }


}



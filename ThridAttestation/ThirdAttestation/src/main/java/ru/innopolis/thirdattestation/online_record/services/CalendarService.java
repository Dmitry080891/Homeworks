package ru.innopolis.thirdattestation.online_record.services;
import ru.innopolis.thirdattestation.online_record.dto.CalendarDto;
import ru.innopolis.thirdattestation.online_record.models.Calendar;


import java.util.List;

public interface CalendarService {
    /**
     * Выгрузка всех окон записи из БД
     * @return List<Calendar>
     */
    List<CalendarDto> getAll(); //показать запись клиентов

     /**
     * Поиск записи в БД по ид
     * @param id - Идентификатор временни записи
     * @return Calendar
     */
     CalendarDto getCalendarById(Long id);

    /**
     * Создание записи и добавление её в БД
    // * @param customerId - Идентификатор клиента
     //* @param timeOrder - Идентификатор времени услуги
     * @return
     */
    CalendarDto create(CalendarDto calendar);
//
    /**
     * Обновление полей существующего в БД окна записи
     * @param calendarId - Идентификатор временного слота
     * @param timeOrder - Объект времени услуги
     * @return CalendarDto
     */
    CalendarDto update(Long calendarId, CalendarDto timeOrder);

    /**
     * Удаление окна записи из БД по идентификатору
     * @param id - Идентификатор времени услуги
     */
    void deleteById(Long id);

}

package ru.innopolis.thirdattestation.online_record.controllers;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.innopolis.thirdattestation.online_record.dto.CalendarDto;
import ru.innopolis.thirdattestation.online_record.services.CalendarService;
@Controller
@RequiredArgsConstructor
@RequestMapping("/calendars")
public class CalendarController {

    private  CalendarService calendarService;
    /**
     * HTTP протокол
     * get - получить данные по ссылке
     */
    @GetMapping
    public String getAll(Model model) {
        model.addAttribute("customers", calendarService.getAll());
        return "calendars";}
    @GetMapping("/{calendar_id}")
    public ResponseEntity<CalendarDto> getCalendarById(@PathVariable("calendar_id")  Long id) {
        return ResponseEntity.ok(calendarService.getCalendarById(id));
    }
    /**
     * HTTP протокол
     * Post - добавить данные по ссылке
     */
    @PostMapping("/add_Calendar")
    public ResponseEntity<CalendarDto> create(@Valid @RequestBody CalendarDto calendar) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(calendarService.create(calendar));
    }
    /**
     * HTTP протокол
     * Put - изменить данные по ссылке
     */
    @PutMapping("/{modifyCalendarId}")
    public ResponseEntity<CalendarDto> update(@PathVariable("modifyCalendarId") Long calendarId,
                                                      @RequestBody CalendarDto newData) {
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .body(calendarService.update(calendarId, newData));
    }
    /**
     * HTTP протокол
     * Delete - удалить данные по ссылке
     */
    @DeleteMapping("/{deleteCalendarId}")
    public ResponseEntity<CalendarDto> deleteCustomer(@PathVariable("deleteCalendarId") Long calendarId) {
        calendarService.deleteById(calendarId);
        return ResponseEntity
                .status(HttpStatus.ACCEPTED).build();
    }
}

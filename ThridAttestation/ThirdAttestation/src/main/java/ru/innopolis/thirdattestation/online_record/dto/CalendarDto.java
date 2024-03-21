package ru.innopolis.thirdattestation.online_record.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.innopolis.thirdattestation.online_record.models.Calendar;



import java.sql.Time;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CalendarDto {
    private Long id;
    private Date dateOrder;
    private Time timeOrder;

    public static CalendarDto from(Calendar calendar) {
        return CalendarDto.builder()
                .id(calendar.getId())
                .dateOrder(calendar.getDateOrder())
                .timeOrder(calendar.getTimeOrder())
                .build();
    }

    public static List<CalendarDto> from(List<Calendar> calendars) {
        return calendars.stream()
                .map(CalendarDto::from)
                .collect(Collectors.toList());

    }
}

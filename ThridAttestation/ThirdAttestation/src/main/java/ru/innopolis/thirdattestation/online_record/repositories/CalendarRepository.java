package ru.innopolis.thirdattestation.online_record.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.innopolis.thirdattestation.online_record.models.Calendar;
import org.springframework.stereotype.Repository;

@Repository
public interface CalendarRepository extends JpaRepository<Calendar, Long> {
}

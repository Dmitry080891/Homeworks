package ru.innopolis.thirdattestation.online_record.repositories;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.innopolis.thirdattestation.online_record.models.Calendar;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CalendarRepository extends JpaRepository<Calendar, Long> {
    @Override
    List<Calendar> findAll(Sort sort);


}

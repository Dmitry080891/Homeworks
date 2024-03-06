package ru.innopolis.thirdattestation.online_record.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.innopolis.thirdattestation.online_record.models.Order;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByAll();
    List<Order> findById();
}

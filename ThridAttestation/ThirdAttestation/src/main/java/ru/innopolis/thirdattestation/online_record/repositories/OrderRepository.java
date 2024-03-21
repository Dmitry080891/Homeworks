package ru.innopolis.thirdattestation.online_record.repositories;

import org.springframework.data.annotation.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.innopolis.thirdattestation.online_record.models.Customer;
import ru.innopolis.thirdattestation.online_record.models.Order;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
   // Optional<Order> findById(Id id);
    List<Order> findAll();
  //  Optional<Order> findByProductName(String productName);

   // void deleteById(Id id);

 //   List<Order> getId();
}

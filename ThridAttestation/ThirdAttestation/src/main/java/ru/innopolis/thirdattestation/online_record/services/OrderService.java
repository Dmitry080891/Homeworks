package ru.innopolis.thirdattestation.online_record.services;

import jakarta.persistence.Column;
import ru.innopolis.thirdattestation.online_record.models.Order;

import java.util.List;

public interface OrderService {
    List<Order> getAll();
    List<Order> getId();
   // List<Order> getProductName();
  //  List<Order> getPrice();

}

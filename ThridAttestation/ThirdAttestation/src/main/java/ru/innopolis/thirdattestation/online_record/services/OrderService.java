package ru.innopolis.thirdattestation.online_record.services;

import jakarta.persistence.Column;
import ru.innopolis.thirdattestation.online_record.dto.OrderDto;
import ru.innopolis.thirdattestation.online_record.models.Order;

import java.util.List;

public interface OrderService {
    List<OrderDto> getOrderAll();

}

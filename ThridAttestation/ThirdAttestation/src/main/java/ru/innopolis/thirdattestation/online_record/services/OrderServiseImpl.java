package ru.innopolis.thirdattestation.online_record.services;


import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Service;
import ru.innopolis.thirdattestation.online_record.dto.CustomerDto;
import ru.innopolis.thirdattestation.online_record.dto.OrderDto;
import ru.innopolis.thirdattestation.online_record.exceptions.FileNotFoundException;
import ru.innopolis.thirdattestation.online_record.models.Order;
import ru.innopolis.thirdattestation.online_record.repositories.OrderRepository;

import java.util.List;

import static ru.innopolis.thirdattestation.online_record.dto.OrderDto.from;

@Service
@RequiredArgsConstructor
public class OrderServiseImpl implements OrderService {
    private final OrderRepository orderRepository;

    /**
     * Получить все услуги из БД
     * @return список услуг
     */
    @Override
    public List<OrderDto> getOrderAll() {
        return from(orderRepository.findAll());
         //Select * from order;
    }


}

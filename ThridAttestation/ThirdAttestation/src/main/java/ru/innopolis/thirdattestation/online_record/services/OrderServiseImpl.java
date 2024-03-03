package ru.innopolis.thirdattestation.online_record.services;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.innopolis.thirdattestation.online_record.models.Order;
import ru.innopolis.thirdattestation.online_record.repositories.OrderRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderServiseImpl implements OrderService {
    private final OrderRepository orderRepository;

    /**
     * Получить всех пользователей из БД
     * @return список пользователей
     */
    @Override
    public List<Order> getAll() {

        return orderRepository.findAll(); //Select * from user;
    }


}

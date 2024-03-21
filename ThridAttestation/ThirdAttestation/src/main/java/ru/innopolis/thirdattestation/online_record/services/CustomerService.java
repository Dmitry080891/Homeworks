package ru.innopolis.thirdattestation.online_record.services;

import ru.innopolis.thirdattestation.online_record.dto.CustomerDto;
import ru.innopolis.thirdattestation.online_record.models.Customer;


import java.util.List;
import java.util.Optional;

public interface CustomerService {

    List<CustomerDto> getAll(); //поиск всех клиентов
    CustomerDto addCustomer(CustomerDto customer); //добавление клиента
    void deleteAll(); //удаление всех клиентов
    CustomerDto getById(Long id); //поиск клиента по ИД
    void deleteById(Long id); //удаление клиента по ИД

    CustomerDto updateCustomer(Long customerId, CustomerDto newData, boolean changeOnlyName);//изменение данных клиента

    CustomerDto create(CustomerDto doctor); //создание нового клиента

}

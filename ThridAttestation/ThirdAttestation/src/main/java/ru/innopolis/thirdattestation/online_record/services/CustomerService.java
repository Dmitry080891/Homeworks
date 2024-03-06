package ru.innopolis.thirdattestation.online_record.services;

import ru.innopolis.thirdattestation.online_record.models.Customer;


import java.util.List;

public interface CustomerService {
    List<Customer> getAll();
    List<Customer> getId();
}

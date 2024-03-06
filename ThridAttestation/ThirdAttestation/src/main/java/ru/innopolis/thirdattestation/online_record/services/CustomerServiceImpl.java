package ru.innopolis.thirdattestation.online_record.services;


import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;
import ru.innopolis.thirdattestation.online_record.models.Customer;
import ru.innopolis.thirdattestation.online_record.repositories.CustomerRepository;

import java.util.List;
@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService{

    private final CustomerRepository customerRepository;

    @Override
    public List<Customer> getAll() {
        return customerRepository.findAll(); //Select * from customer;
    }

    @Override
    public List<Customer> getId() {
        return customerRepository.findById();  //Select * from customer where id =;
    }
}

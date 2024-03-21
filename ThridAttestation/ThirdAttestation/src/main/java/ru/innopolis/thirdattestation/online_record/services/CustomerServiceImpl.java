package ru.innopolis.thirdattestation.online_record.services;

import ru.innopolis.thirdattestation.online_record.exceptions.CustomerNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.innopolis.thirdattestation.online_record.dto.CustomerDto;
import ru.innopolis.thirdattestation.online_record.models.Customer;
import ru.innopolis.thirdattestation.online_record.repositories.CustomerRepository;
import java.util.List;

import static ru.innopolis.thirdattestation.online_record.dto.CustomerDto.from;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService{

    private final CustomerRepository customerRepository;
    @Override
    public List<CustomerDto> getAll() {
        return from(customerRepository.findAll());

    }

    @Override
    public void deleteAll() {

        customerRepository.deleteAll();
    }


    @Override
    public CustomerDto getById(Long id) {
        return from(customerRepository.findById(id).orElseThrow(CustomerNotFoundException::new));
    }

    @Override
    public CustomerDto addCustomer(CustomerDto customer) {
        return from(customerRepository.save(
                Customer.builder()
                        .firstName(customer.getFirstName())
                        .lastName(customer.getLastName())
                        .build()));
    }



    @Override
    public void deleteById(Long id) {

        customerRepository.deleteById(id);

    }

    @Override
    public CustomerDto updateCustomer(Long customerId, CustomerDto newData, boolean changeOnlyName) {
        Customer customer = customerRepository.findById(customerId).orElseThrow(CustomerNotFoundException::new);

        if(!changeOnlyName) {
            customer.setLastName(newData.getLastName());
        }
        customer.setFirstName(newData.getFirstName());


        return from(customerRepository.save(customer));
    }



    @Override
    public CustomerDto create(CustomerDto customer) {

        return from(customerRepository.save(
                Customer.builder()
                        .firstName(customer.getFirstName())
                        .lastName(customer.getLastName())
                        .build()));
    }
}

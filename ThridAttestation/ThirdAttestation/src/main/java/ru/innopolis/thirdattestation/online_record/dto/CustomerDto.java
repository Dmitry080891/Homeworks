package ru.innopolis.thirdattestation.online_record.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.innopolis.thirdattestation.online_record.models.Customer;


import java.util.List;
import java.util.stream.Collectors;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDto {
    private Long id;
    private String firstName;
    private String lastName;
    private Long phone;

    public static CustomerDto from(Customer customer) {
        return CustomerDto.builder()
                .id(customer.getId())
                .firstName(customer.getFirstName())
                .lastName(customer.getLastName())
                .phone(customer.getPhone())
                .build();
    }

    public static List<CustomerDto> from(List<Customer> customers) {
        return customers.stream()
                .map(CustomerDto::from)
                .collect(Collectors.toList());
    }
}

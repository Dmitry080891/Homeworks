package ru.innopolis.thirdattestation.online_record.controllers;


import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.Parameter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.innopolis.thirdattestation.online_record.dto.CustomerDto;
import ru.innopolis.thirdattestation.online_record.services.CustomerService;
import io.swagger.v3.oas.annotations.Operation;

import io.swagger.v3.oas.annotations.tags.Tag;

@Controller
@RequiredArgsConstructor
@RequestMapping("/customers")
public class CustomerController {
    private final CustomerService customerService;

    @GetMapping
    public String getAll(Model model) {
        model.addAttribute("customers", customerService.getCustomerAll());
        return "customers";}
    @GetMapping("/{customer_id}")
    public ResponseEntity<CustomerDto> getCustomerById(@PathVariable("customer_id")  Long id) {
        return ResponseEntity.ok(customerService.getCustomerById(id));
    }

    @PostMapping("/add_Customer")
    public ResponseEntity<CustomerDto> addCustomer(@Valid @RequestBody CustomerDto customer) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(customerService.create(customer));
    }
    @PutMapping("/{modifyCustomerId}")
    public ResponseEntity<CustomerDto> modifyCustomer(@PathVariable("modifyCustomerId") Long customerId,
                                                @RequestBody CustomerDto newData, boolean changeOnlyName) {
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .body(customerService.updateCustomer(customerId, newData, changeOnlyName));
    }

    @DeleteMapping("/{deleteCustomerId}")
    public ResponseEntity<CustomerDto> deleteCustomer(@PathVariable("deleteCustomerId") Long customerId) {
        customerService.deleteCustomerById(customerId);
        return ResponseEntity
                .status(HttpStatus.ACCEPTED).build();
    }

}

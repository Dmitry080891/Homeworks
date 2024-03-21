package ru.innopolis.thirdattestation.online_record.controllers;


import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.Parameter;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
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
    public String getCustomerAll(Model model) {
        model.addAttribute("customers", customerService.getAll());
        return "customers";}

    public ResponseEntity<CustomerDto> getCustomerById(@PathVariable("customer-id")  Long id) {
        return ResponseEntity.ok(customerService.getById(id));
    }



}

package ru.innopolis.thirdattestation.online_record.controllers;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.innopolis.thirdattestation.online_record.services.CustomerService;


@Controller
@RequiredArgsConstructor
@RequestMapping("/customers")
public class CustomerController {
    private final CustomerService customerService;

    @GetMapping
    public String getCustomerAll(Model model) {
        model.addAttribute("customers", customerService.getAll());
        return "customers";}

    public String getCustomerID(Model model) {
        model.addAttribute("customers", customerService.getId());
        return "customers";
    }
}

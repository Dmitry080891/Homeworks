package ru.innopolis.thirdattestation.online_record.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.innopolis.thirdattestation.online_record.services.OrderService;

/**
 * localhost:8080/orders
 */
@Controller
@RequiredArgsConstructor
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;

    /**
     * HTTP протокол
     * get - получить данные по ссылке
     */
    @GetMapping
    public String getOrderAll(Model model) {
        model.addAttribute("orders", orderService.getAll());
        return "orders";}

    public String getOrderID(Model model) {
        model.addAttribute("orders", orderService.getId());
        return "orders";
    }
}



package ru.innopolis.thirdattestation.online_record.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
    @Table(name="order")
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public class Order {
        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE)
        private Long id;

        @Column(name = "product_name")
        private String productName;
        @Column(name = "product_price")
        private Integer price;

    @OneToMany(mappedBy="orders")
    private List<Calendar> calendarList;

    }


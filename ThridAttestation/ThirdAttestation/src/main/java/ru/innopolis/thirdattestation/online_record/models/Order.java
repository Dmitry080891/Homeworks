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
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "product_name")
        private String productName;
        @Column(name = "product_price")
        private Integer price;


        @OneToMany(mappedBy = "order")
        private List<Customer> customers;
     //   @ManyToOne
     //   @JoinColumn(name="customer_id", nullable = false)
     //   private Customer customer;
    }


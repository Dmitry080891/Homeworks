package ru.innopolis.thirdattestation.online_record.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;
import java.util.Date;

@Entity
@Table(name="calendar_orders")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Calendar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "date")
    private Date dateOrder;
    @Column(name = "time")
    private Time timeOrder;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "first_name", nullable = false),
            @JoinColumn(name="last_name", nullable = false),
            @JoinColumn(name="product_name",  nullable = false)
    })
    private Customer customer;
    private Order order;
}

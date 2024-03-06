package ru.innopolis.thirdattestation.online_record.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;
import java.util.Date;

@Entity
@Table(name="calendar")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Calendar {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(name = "date")
    private Date dateOrder;
    @Column(name = "time")
    private Time timeOrder;

    @ManyToOne
    @JoinColumn(name="order_id", nullable = false)
    private Order orders;

    @ManyToOne
    @JoinColumn(name="customer_id", nullable = false)
    private Customer customers;

}

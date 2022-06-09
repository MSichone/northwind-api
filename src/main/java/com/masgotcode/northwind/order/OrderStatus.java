package com.masgotcode.northwind.order;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity(name = "OrderStatus")
@Table(name = "orders_status")
public class OrderStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String statusName;

}

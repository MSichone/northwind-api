package com.masgotcode.northwind.order;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "order_details_status")
public class OrderDetailStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String statusName;
}
package com.masgotcode.northwind.order;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity(name = "OrderTaxStatus")
@Table(name = "orders_tax_status")
public class OrderTaxStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String taxStatusName;
}


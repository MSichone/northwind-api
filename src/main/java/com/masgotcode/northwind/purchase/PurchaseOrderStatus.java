package com.masgotcode.northwind.purchase;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity(name = "PurchaseOrderStatus")
@Table(name = "purchase_order_status")
public class PurchaseOrderStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String status;
}

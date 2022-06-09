package com.masgotcode.northwind.order;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.masgotcode.northwind.product.Product;
import lombok.Data;
import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity(name = "OrderDetails")
@Table(name = "order_details")
public class OrderDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Product product;
    @Column
    private int quantity;
    @Column
    private double unitPrice;
    @Column
    private double discount;
    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    private Orders order;
    @ManyToOne
    private OrderDetailsStatus status;
    @Column
    private LocalDateTime dateAllocated;
    @Column
    private Long purchaseOrderId;
    @Column
    private Long inventoryId;
}

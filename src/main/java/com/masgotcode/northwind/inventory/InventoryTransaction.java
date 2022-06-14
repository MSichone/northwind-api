package com.masgotcode.northwind.inventory;

import com.masgotcode.northwind.order.Orders;
import com.masgotcode.northwind.product.Product;
import com.masgotcode.northwind.purchase.PurchaseOrder;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity(name = "InventoryTransaction")
@Table(name = "inventory_transactions")
public class InventoryTransaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "transactionType")
    private InventoryTransactionType transactionType;
    @CreationTimestamp
    private LocalDateTime transactionCreatedDate;
    @UpdateTimestamp
    private LocalDateTime transactionModifiedDate;
    @ManyToOne
    private Product product;
    @Column
    private Integer quantity;
    @ManyToOne
    private PurchaseOrder purchaseOrder;
    @ManyToOne
    @JoinColumn(name = "customer_order_id")
    private Orders customerOrderId;
    @Column
    private String comments;
}


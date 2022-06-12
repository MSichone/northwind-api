package com.masgotcode.northwind.purchase;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.masgotcode.northwind.inventory.InventoryTransaction;
import com.masgotcode.northwind.product.Product;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "purchase_order_details")
public class PurchaseOrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private InventoryTransaction inventory;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    private PurchaseOrder purchaseOrder;

    @ManyToOne
    private Product product;
    @Column
    private Integer quantity;
    @Column
    private Double unitCost;
    @Column
    private LocalDateTime dateReceived;
    @Column(columnDefinition = "bit default 0")
    private boolean postedToInventory;
}

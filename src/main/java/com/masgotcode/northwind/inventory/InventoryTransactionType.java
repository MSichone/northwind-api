package com.masgotcode.northwind.inventory;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "inventory_transaction_types")
public class InventoryTransactionType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;
    @Column
    private String typeName;
}

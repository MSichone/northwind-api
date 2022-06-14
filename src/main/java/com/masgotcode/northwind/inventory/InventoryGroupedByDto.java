package com.masgotcode.northwind.inventory;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InventoryGroupedByDto {
    private long id;
    private String productName;
    private long quantity;
}

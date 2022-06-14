package com.masgotcode.northwind.inventory;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InventoryDto {
    private long productId;
    private String productName;
    private String productCode;
    private long qtyPurchased;
    private long qtySold;
    private long qtyOnHold;
    private long qtyOnHand;
    private long qtyAvailable;
    private long qtyOnOrder;
    private long qtyOnBackOrder;
    private int reorderLevel;
    private int targetLevel;
    private long qtyBelowTargetLevel;
    private long currentLevel;
    private long qtyToReorder;

    public InventoryDto(long productId, String productName, String productCode, int reorderLevel, int targetLevel) {
        this.productId = productId;
        this.productName = productName;
        this.productCode = productCode;
        this.reorderLevel = reorderLevel;
        this.targetLevel = targetLevel;
    }
}

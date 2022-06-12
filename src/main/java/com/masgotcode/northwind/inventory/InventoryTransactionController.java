package com.masgotcode.northwind.inventory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/inventory")
public class InventoryTransactionController {
    private final Logger log = LoggerFactory.getLogger(InventoryTransactionController.class);
    private final InventoryService inventoryService;

    @Autowired
    public InventoryTransactionController(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    @GetMapping("transactions/all")
    public Iterable<InventoryTransaction> getAllInventoryTransactions(){
        log.info("InventoryTransactionController.getAllInventoryTransactions");
        return inventoryService.getAllInventoryTransactions();
    }
}

package com.masgotcode.northwind.inventory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InventoryService {
    private final Logger log = LoggerFactory.getLogger(InventoryService.class);
    private final InventoryTransactionTypeRepository inventoryTransactionTypeRepository;
    private final InventoryTransactionRepository inventoryTransactionRepository;

    @Autowired
    public InventoryService(InventoryTransactionTypeRepository inventoryTransactionTypeRepository, InventoryTransactionRepository inventoryTransactionRepository) {
        this.inventoryTransactionTypeRepository = inventoryTransactionTypeRepository;
        this.inventoryTransactionRepository = inventoryTransactionRepository;
    }

    public Iterable<InventoryTransaction> getAllInventoryTransactions(){
        log.info("InventoryService.getAllInventoryTransactions");
        return inventoryTransactionRepository.findAll();
    }

    public Iterable<InventoryTransactionType> getAllInventoryTransactionsTypes(){
        log.info("InventoryService.getAllInventoryTransactionsTypes");
        return inventoryTransactionTypeRepository.findAll();
    }
}

package com.masgotcode.northwind.inventory;

import com.masgotcode.northwind.product.Product;
import com.masgotcode.northwind.product.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class InventoryService {
    private final Logger log = LoggerFactory.getLogger(InventoryService.class);
    private final InventoryTransactionTypeRepository inventoryTransactionTypeRepository;
    private final InventoryTransactionRepository inventoryTransactionRepository;
    private final ProductRepository productRepository;

    @Autowired
    public InventoryService(InventoryTransactionTypeRepository inventoryTransactionTypeRepository, InventoryTransactionRepository inventoryTransactionRepository, ProductRepository productRepository) {
        this.inventoryTransactionTypeRepository = inventoryTransactionTypeRepository;
        this.inventoryTransactionRepository = inventoryTransactionRepository;
        this.productRepository = productRepository;
    }

    public Iterable<InventoryTransaction> getAllInventoryTransactions(){
        log.info("InventoryService.getAllInventoryTransactions");
        return inventoryTransactionRepository.findAll();
    }

    public Iterable<InventoryTransactionType> getAllInventoryTransactionsTypes(){
        log.info("InventoryService.getAllInventoryTransactionsTypes");
        return inventoryTransactionTypeRepository.findAll();
    }

    public Iterable<InventoryGroupedByDto> getAllInventoryPurchased(){
        log.info("InventoryService.getAllInventoryPurchased");
        return inventoryTransactionRepository.findGroupByInventoryPurchased();
    }
    public Iterable<InventoryGroupedByDto> getAllInventoryOnHold(){
        log.info("InventoryService.getAllInventoryOnHold");
        return inventoryTransactionRepository.findGroupByInventoryOnHold();
    }

    public Iterable<InventoryGroupedByDto> getAllInventorySold(){
        log.info("InventoryService.getAllInventorySold");
        return inventoryTransactionRepository.findGroupByInventorySold();
    }

    public InventoryGroupedByDto getInventorySoldFor(Long id){
        log.info("InventoryService.getInventorySoldFor["+id+"]");
        Optional<Product> optionalProduct = productRepository.findById(id);
        if(optionalProduct.isPresent()){
            return inventoryTransactionRepository.findInventorySoldForProduct(optionalProduct.get());
        }
        return null;
    }

    public Iterable<InventoryDto> getAllInventory(){
        log.info("InventoryService.getAllInventory");
        List<InventoryDto> inventoryDtoList = new ArrayList<>();

        inventoryDtoList = inventoryTransactionRepository.findInventory();

        for(InventoryDto inventoryDto: inventoryDtoList){
            inventoryDto.setQtySold(getInventorySoldFor(inventoryDto.getProductId()).getQuantity());
        }

        return inventoryDtoList;
    }

}

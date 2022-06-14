package com.masgotcode.northwind.inventory;

import com.masgotcode.northwind.product.Product;
import com.masgotcode.northwind.product.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("api/inventory")
public class InventoryTransactionController {
    private final Logger log = LoggerFactory.getLogger(InventoryTransactionController.class);
    private final InventoryService inventoryService;
    private final ProductService productService;

    @Autowired
    public InventoryTransactionController(InventoryService inventoryService, ProductService productService) {
        this.inventoryService = inventoryService;
        this.productService = productService;
    }

    @GetMapping("transactions/all")
    public Iterable<InventoryTransaction> getAllInventoryTransactions(){
        log.info("InventoryTransactionController.getAllInventoryTransactions");
        return inventoryService.getAllInventoryTransactions();
    }

    @GetMapping("all")
    public Iterable<InventoryDto> getAllInventory(){
        log.info("InventoryTransactionController.getAllInventory");
        return inventoryService.getAllInventory();
    }

    @GetMapping("purchased")
    public Iterable<InventoryGroupedByDto> getAllInventoryPurchased(){
        log.info("InventoryTransactionController.getAllInventoryPurchased");
        return inventoryService.getAllInventoryPurchased();
    }

    @GetMapping("hold")
    public Iterable<InventoryGroupedByDto> getAllInventoryOnHold(){
        log.info("InventoryTransactionController.getAllInventoryOnHold");
        return inventoryService.getAllInventoryOnHold();
    }

    @GetMapping("sold")
    public Iterable<InventoryGroupedByDto> getAllInventorySold(){
        log.info("InventoryTransactionController.getAllInventorySold");
        return inventoryService.getAllInventorySold();
    }

    @GetMapping("sold/{id}")
    public InventoryGroupedByDto getInventorySoldForProduct(@PathVariable Long id){
        log.info("InventoryTransactionController.getInventorySoldForProduct["+id+"]");
        /*Optional<Product> optionalProduct = productService.getProductById(id);
        if(optionalProduct.isPresent()){
            return inventoryService.getInventorySoldFor(optionalProduct.get());
        }*/
        return inventoryService.getInventorySoldFor(id);
    }
}

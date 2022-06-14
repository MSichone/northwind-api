package com.masgotcode.northwind.inventory;

import com.masgotcode.northwind.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InventoryTransactionRepository extends JpaRepository<InventoryTransaction,Long> {

    @Query("select new com.masgotcode.northwind.inventory.InventoryGroupedByDto(t.product.id,t.product.productName, sum(t.quantity)) from InventoryTransaction as t where t.transactionType.id = 1 group by t.product.productName, t.product.id")
    List<InventoryGroupedByDto> findGroupByInventoryPurchased();

    @Query("select new com.masgotcode.northwind.inventory.InventoryGroupedByDto(t.product.id,t.product.productName, sum(t.quantity)) from InventoryTransaction as t where t.transactionType.id = 2 group by t.product.productName, t.product.id")
    List<InventoryGroupedByDto> findGroupByInventorySold();

    @Query("select new com.masgotcode.northwind.inventory.InventoryGroupedByDto(t.product.id,t.product.productName, sum(t.quantity)) from InventoryTransaction as t where t.transactionType.id = 2 and t.product = :productToQuery")
    InventoryGroupedByDto findInventorySoldForProduct(@Param("productToQuery")Product product);


    @Query("select new com.masgotcode.northwind.inventory.InventoryGroupedByDto(t.product.id,t.product.productName, sum(t.quantity)) from InventoryTransaction as t where t.transactionType.id = 3 group by t.product.productName, t.product.id")
    List<InventoryGroupedByDto> findGroupByInventoryOnHold();

    @Query("select new com.masgotcode.northwind.inventory.InventoryDto(p.id,p.productName,p.productCode,p.reorderLevel,p.targetLevel) " +
            "from Product as p")
    List<InventoryDto> findInventory();
}

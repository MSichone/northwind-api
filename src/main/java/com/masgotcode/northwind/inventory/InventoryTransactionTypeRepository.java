package com.masgotcode.northwind.inventory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryTransactionTypeRepository extends JpaRepository<InventoryTransactionType,Long> {

}

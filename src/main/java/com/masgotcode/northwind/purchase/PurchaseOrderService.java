package com.masgotcode.northwind.purchase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PurchaseOrderService {
    private final Logger log = LoggerFactory.getLogger(PurchaseOrderService.class);
    private final PurchaseOrderRepository purchaseOrderRepository;

    @Autowired
    public PurchaseOrderService(PurchaseOrderRepository purchaseOrderRepository) {
        this.purchaseOrderRepository = purchaseOrderRepository;
    }

    public Iterable<PurchaseOrder> getAllPurchaseOrders(){
        log.info("PurchaseOrderService.getAllPurchaseOrders");
        return purchaseOrderRepository.findAll();
    }
}

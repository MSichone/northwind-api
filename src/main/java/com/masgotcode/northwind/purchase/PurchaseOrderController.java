package com.masgotcode.northwind.purchase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/purchase-order")
public class PurchaseOrderController {
    private final Logger log = LoggerFactory.getLogger(PurchaseOrderController.class);
    private final PurchaseOrderService purchaseOrderService;

    @Autowired
    public PurchaseOrderController(PurchaseOrderService purchaseOrderService) {
        this.purchaseOrderService = purchaseOrderService;
    }

    @GetMapping("all")
    public Iterable<PurchaseOrder> getAllPurchaseOrders(){
        log.info("PurchaseOrderController.getAllPurchaseOrders");
        return purchaseOrderService.getAllPurchaseOrders();
    }
}

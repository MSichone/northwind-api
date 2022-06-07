package com.masgotcode.northwind.supplier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/supplier")
public class SupplierController {
    private final Logger log = LoggerFactory.getLogger(SupplierController.class);

    private final SupplierService supplierService;

    @Autowired
    public SupplierController(SupplierService supplierService) {
        this.supplierService = supplierService;
    }

    @GetMapping("all")
    public Iterable<Supplier> getAllSuppliers(){
        log.info("SupplierController.getAllSuppliers");
        return supplierService.getAllSuppliers();
    }
}

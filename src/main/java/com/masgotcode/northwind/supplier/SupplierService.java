package com.masgotcode.northwind.supplier;

import com.masgotcode.northwind.customer.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SupplierService {
    private final Logger log = LoggerFactory.getLogger(SupplierService.class);
    private final SupplierRepository supplierRepository;

    @Autowired
    public SupplierService(SupplierRepository supplierRepository) {
        this.supplierRepository = supplierRepository;
    }

    public Iterable<Supplier> getAllSuppliers(){
        log.info("SupplierService.getAllSuppliers");
        return supplierRepository.findAll();
    }

    public Optional<Supplier> getSupplierById(Long id){
        log.info("SupplierService.getSupplierById["+id+"]");
        return supplierRepository.findById(id);
    }
}

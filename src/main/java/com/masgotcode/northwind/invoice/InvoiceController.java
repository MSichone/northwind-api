package com.masgotcode.northwind.invoice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/invoice")
public class InvoiceController {
    private final Logger log = LoggerFactory.getLogger(InvoiceController.class);
    private final InvoiceService invoiceService;

    @Autowired
    public InvoiceController(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }

    @GetMapping("all")
    public Iterable<Invoice> getAllInvoices(){
        log.info("InvoiceController.getAllInvoices");
        return invoiceService.getAllInvoices();
    }
}

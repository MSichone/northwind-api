package com.masgotcode.northwind.shipper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/shipper")
public class ShipperController {

    private final Logger log = LoggerFactory.getLogger(ShipperController.class);
    private final ShipperService shipperService;

    @Autowired
    public ShipperController(ShipperService shipperService) {
        this.shipperService = shipperService;
    }

    @GetMapping("all")
    public Iterable<Shipper> getAllShippers(){
        log.info("ShipperController.getAllShippers");
        return shipperService.getAllShippers();
    }
}

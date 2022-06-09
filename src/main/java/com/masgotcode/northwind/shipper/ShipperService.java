package com.masgotcode.northwind.shipper;

import com.masgotcode.northwind.customer.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ShipperService {

    private final Logger log = LoggerFactory.getLogger(ShipperService.class);
    private final ShipperRepository shipperRepository;

    @Autowired
    public ShipperService(ShipperRepository shipperRepository) {
        this.shipperRepository = shipperRepository;
    }

    public Iterable<Shipper> getAllShippers(){
        log.info("ShipperService.getAllShippers");
        return shipperRepository.findAll();
    }

    public Optional<Shipper> getShipperById(Long id){
        log.info("ShipperService.getShipperById["+id+"]");
        return shipperRepository.findById(id);
    }
}

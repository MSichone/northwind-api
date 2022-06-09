package com.masgotcode.northwind.order;

import com.masgotcode.northwind.customer.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    private Logger log = LoggerFactory.getLogger(OrderService.class);

    private final OrdersRepository ordersRepository;
    private final OrderDetailsRepository orderDetailsRepository;
    private final OrderDetailsStatusRepository orderDetailsStatusRepository;
    private final OrderStatusRepository orderStatusRepository;
    private final OrderTaxStatusRepository orderTaxStatusRepository;

    public OrderService(OrdersRepository ordersRepository, OrderDetailsRepository orderDetailsRepository, OrderDetailsStatusRepository orderDetailsStatusRepository, OrderStatusRepository orderStatusRepository, OrderTaxStatusRepository orderTaxStatusRepository) {
        this.ordersRepository = ordersRepository;
        this.orderDetailsRepository = orderDetailsRepository;
        this.orderDetailsStatusRepository = orderDetailsStatusRepository;
        this.orderStatusRepository = orderStatusRepository;
        this.orderTaxStatusRepository = orderTaxStatusRepository;
    }

    public List<Orders> getAllOrders(){
        log.info("OrderService.getAllOrders");
        return ordersRepository.findAll();
    }

    public List<Orders> getAllOrdersByCustomer(Customer customer){
        log.info("OrderService.getAllOrdersByCustomer[" + customer.getFirstName() + " " + customer.getLastName()+"]");
        return ordersRepository.findAllByCustomer(customer);
    }


}

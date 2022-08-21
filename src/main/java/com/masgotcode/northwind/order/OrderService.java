package com.masgotcode.northwind.order;

import com.masgotcode.northwind.customer.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderService {
    private Logger log = LoggerFactory.getLogger(OrderService.class);

    private final OrdersRepository ordersRepository;
    private final OrderDetailRepository orderDetailRepository;
    private final OrderDetailStatusRepository orderDetailStatusRepository;
    private final OrderStatusRepository orderStatusRepository;
    private final OrderTaxStatusRepository orderTaxStatusRepository;

    public OrderService(OrdersRepository ordersRepository, OrderDetailRepository orderDetailRepository, OrderDetailStatusRepository orderDetailStatusRepository, OrderStatusRepository orderStatusRepository, OrderTaxStatusRepository orderTaxStatusRepository) {
        this.ordersRepository = ordersRepository;
        this.orderDetailRepository = orderDetailRepository;
        this.orderDetailStatusRepository = orderDetailStatusRepository;
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

    public List<OrderDTO> getAllOrderDTOs(){
        log.info("OrderService.getAllOrderDTOs");
        return getAllOrders()
                .stream()
                .map(OrderDTO::map)
                .collect(Collectors.toList());
    }

}

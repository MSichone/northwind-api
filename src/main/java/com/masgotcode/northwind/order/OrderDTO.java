package com.masgotcode.northwind.order;

import com.masgotcode.northwind.employee.Employee;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class OrderDTO {
    private Long id;
    private LocalDateTime orderDate;
    private String orderStatus;
    private String salesperson;
    private String customer;
    private LocalDateTime shipDate;
    private double shippingFee;
    private double taxes;

    private double total;

    public OrderDTO(Long id, LocalDateTime orderDate, String salesperson, String customer, double total) {
        this.id = id;
        this.orderDate = orderDate;
        this.salesperson = salesperson;
        this.customer = customer;
        this.total = total;
    }

    public static OrderDTO map(Orders order) {
        return new OrderDTO(
                order.getId(),
                order.getOrderDate(),
                order.getEmployee().getFullName(),
                order.getCustomer().getFullName(),
                order.orderDetails
                        .stream()
                        .mapToDouble(OrderDetail::getUnitPrice)
                        .sum()
        );
    }
}

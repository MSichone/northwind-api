package com.masgotcode.northwind.order;

import com.masgotcode.northwind.customer.Customer;
import com.masgotcode.northwind.employee.Employee;
import com.masgotcode.northwind.shipper.Shipper;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity(name = "Orders")
@Table(name = "orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Employee employee;
    @ManyToOne
    private Customer customer;
    @CreationTimestamp
    private LocalDateTime orderDate;
    @Column
    private LocalDateTime shippedDate;
    @ManyToOne
    private Shipper shipper;
    @Column
    private String shipName;
    @Column
    private String shipAddress;
    @Column
    private String shipCity;
    @Column
    private String shipStateProvince;
    @Column
    private String shipZipPostalCode;
    @Column
    private String shipCountryRegion;
    @Column
    private double shippingFee;
    @Column
    private double taxes;
    @Column
    private String paymentType;
    @Column
    private LocalDateTime paidDate;
    @Column
    private String notes;
    @Column
    private double taxRate;
    @ManyToOne
    private OrderTaxStatus taxStatus;
    @ManyToOne
    private OrderStatus status;

    @OneToMany(
            mappedBy = "order",
            fetch = FetchType.EAGER,
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    List<OrderDetails> orderDetails = new ArrayList<>();

    public void addLineItem(OrderDetails lineItem){
        orderDetails.add(lineItem);
        lineItem.setOrder(this);
    }
}


package com.masgotcode.northwind.invoice;

import com.masgotcode.northwind.order.Orders;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity(name = "Invoice")
@Table(name = "invoices")
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Orders order;
    @Column
    private LocalDateTime invoiceDate;
    @Column
    private LocalDateTime dueDate;
    @Column
    private Double tax;
    @Column
    private Double shipping;
    @Column
    private Double amountDue;

}

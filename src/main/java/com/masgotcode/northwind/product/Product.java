package com.masgotcode.northwind.product;

import com.masgotcode.northwind.supplier.Supplier;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "Product")
@Table(name =  "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Supplier supplier;
    @Column
    private String productCode;
    @Column
    private String productName;
    @Column
    private String description;
    @Column
    private Double standardCost;
    @Column
    private Double listPrice;
    @Column
    private Integer reorderLevel;
    @Column
    private Integer targetLevel;
    @Column
    private String quantityPerUnit;
    @Column(columnDefinition = "bit default 0")
    private boolean discontinued;
    @Column
    private Integer minimumReorderQuantity;

    @Column
    private String supplier_ids;
    @Column(name = "category")
    private String categoryName;


}

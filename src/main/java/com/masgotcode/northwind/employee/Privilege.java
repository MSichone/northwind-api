package com.masgotcode.northwind.employee;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "Privilege")
@Table(name = "privileges")
public class Privilege {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String privilegeName;
}

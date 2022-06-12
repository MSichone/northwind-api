package com.masgotcode.northwind.contact;

import lombok.Data;

import javax.persistence.*;

@Data
@MappedSuperclass
public abstract class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String company;
    @Column
    private String lastName;
    @Column
    private String firstName;
    @Column
    private String emailAddress;
    @Column
    private String jobTitle;
    @Column
    private String businessPhone;
    @Column
    private String homePhone;
    @Column
    private String mobilePhone;
    @Column
    private String faxNumber;
    @Column
    private String address;
    @Column
    private String city;
    @Column
    private String stateProvince;
    @Column
    private String zipPostalCode;
    @Column
    private String countryRegion;
    @Column
    private String webPage;
    @Column
    private String notes;

}

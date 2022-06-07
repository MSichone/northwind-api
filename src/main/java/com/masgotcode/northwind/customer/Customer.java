package com.masgotcode.northwind.customer;

import com.masgotcode.northwind.contact.Contact;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity(name = "Customer")
@Table(name = "customers")
public class Customer extends Contact {
}
